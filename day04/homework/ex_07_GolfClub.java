package homework;

public class ex_07_GolfClub {
	int num = 7;
	String golfchae = "아이언";
	
	public ex_07_GolfClub() {
	}
	
	public ex_07_GolfClub(int num) {
		this.num = num;
	}
	
	public ex_07_GolfClub(String golfchae) {
		this.golfchae = golfchae;
	}
	
	public void print() {
		if(golfchae.equals("퍼터")) {
			System.out.println("퍼터입니다.");
		}else {
			System.out.printf("%d번 %s입니다.\n", num, golfchae);
		}
	}
}
