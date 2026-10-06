package chap7Pro_06;

public class HumanTest {
	public static void main(String[] args) {
		Human.echo();	// 객체생성없이 클래스 명으로 바로 접근 : static
		
		Student s = new Student(20);
		s.print();
		s.eat();
		
		Human p = new Worker();
		p.print();
		p.eat();
		
		
	}
}
