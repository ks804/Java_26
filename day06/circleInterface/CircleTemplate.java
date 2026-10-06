package circleInterface;

public interface CircleTemplate {
	double PI = 3.14;	// interface는 상수만 데이터로 넣을 수 있음
						// (따로 지정안해줘도 자동으로 final static public이 생략되어있다.)
	
	// 일반적으로 인터페이스 안에는 소통하는 용도의 메서드만 들어간다. (필드 구현은 가능하다)
	double getArea();
}
