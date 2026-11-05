package bank.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberOracleDao implements MemberDao {

	private static final String URL = "jdbc:oracle:thin:@localhost:1521:free";
	private static final String USER = "hr";
	private static final String PASSWORD = "hr";

	// DB와 연결된 Connection 반환
	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}

	@Override
	public boolean save(Member m) {
		String sql = "INSERT INTO BANK_MEMBER (id, password, name, email, mobile, type)";
			   sql += " VALUES (?, ?, ?, ?, ?, ?)";
		
		try (Connection conn = getConnection(); //DB와 연결, conn변수에 저장
			 PreparedStatement pstmt = conn.prepareStatement(sql)) { //SQL을 실행 준비, pstmt변수에 저장
			int loc = 1;
			pstmt.setString(loc++, m.getId()); // 1번 ? 에 아이디 저장
			pstmt.setString(loc++, m.getPassword()); // 2번 ? 에 비밀번호 저장
			pstmt.setString(loc++, m.getName()); // 3번 ? 에 이름 저장
			pstmt.setString(loc++, m.getEmail()); // 4번 ? 에 이메일 저장
			pstmt.setString(loc++, m.getMobile()); // 5번 ? 에 전화번호 저장
			pstmt.setString(loc++, String.valueOf(m.getType())); // 6번 ? 에 회원타입 저장
			return pstmt.executeUpdate() == 1; // INSERT 성공했는지 여부
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Member> findAll() {
		String sql = "SELECT id, password, name, email, mobile, type";
			   sql += " FROM BANK_MEMBER";
		List<Member> members = new ArrayList<>();
		
		try (Connection conn = getConnection(); //DB와 연결, conn변수에 저장
			 PreparedStatement pstmt = conn.prepareStatement(sql); //SQL을 실행 준비, pstmt변수에 저장
			 ResultSet rs = pstmt.executeQuery()) { //SQL을 실행, rs변수에 저장
			while (rs.next()) {
				String id = rs.getString("id");
				String password = rs.getString("password");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String mobile = rs.getString("mobile");
				char type = rs.getString("type").charAt(0);
				
				members.add(new Member(id, password, name, email, mobile, type));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if (members.isEmpty()) return null; // 회원이 없으면 null (MemberListDao와 동일)
		return members;
	}

	@Override
	public Member findById(String id) {
		String sql = "SELECT id, password, name, email, mobile, type";
			   sql += " FROM BANK_MEMBER";
			   sql += " WHERE id = ?";
		
		try (Connection conn = getConnection(); //DB와 연결, conn변수에 저장
			 PreparedStatement pstmt = conn.prepareStatement(sql)) { //SQL을 실행 준비, pstmt변수에 저장
			pstmt.setString(1, id); // ? 에 아이디 넣기
			try (ResultSet rs = pstmt.executeQuery()) { //SQL을 실행, rs변수에 저장
				if (rs.next()) {
					String password = rs.getString("password");
					String name = rs.getString("name");
					String email = rs.getString("email");
					String mobile = rs.getString("mobile");
					char type = rs.getString("type").charAt(0);
					
					return new Member(id, password, name, email, mobile, type);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null; // 아이디가 없는 경우
	}

	@Override
	public boolean update(Member m) {
		if (m == null) return false;
		String sql = "UPDATE BANK_MEMBER";
			   sql += " SET password = ?, name = ?, email = ?, mobile = ?, type = ?";
			   sql += " WHERE id = ?";
		
		try (Connection conn = getConnection(); //DB와 연결, conn변수에 저장
			 PreparedStatement pstmt = conn.prepareStatement(sql)) { //SQL을 실행 준비, pstmt변수에 저장
			int loc = 1;
			pstmt.setString(loc++, m.getPassword());
			pstmt.setString(loc++, m.getName());
			pstmt.setString(loc++, m.getEmail());
			pstmt.setString(loc++, m.getMobile());
			pstmt.setString(loc++, String.valueOf(m.getType()));
			pstmt.setString(loc++, m.getId()); // WHERE 조건의 아이디
			return pstmt.executeUpdate() == 1; // UPDATE 성공했는지 여부
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Member m) {
		if (m == null) return false;
		String sql = "DELETE FROM BANK_MEMBER";
			   sql += " WHERE id = ?";
		
		try (Connection conn = getConnection(); //DB와 연결, conn변수에 저장
			 PreparedStatement pstmt = conn.prepareStatement(sql)) { //SQL을 실행 준비, pstmt변수에 저장
			pstmt.setString(1, m.getId());
			return pstmt.executeUpdate() == 1; // DELETE 성공했는지 여부
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
