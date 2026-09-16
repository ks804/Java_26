package programing2;

public class ForeignStudent extends Student{
	String country;
	
	void show() {
		System.out.println("[이름 : " + name + ", " + "나이 : " + age + ", " + "학번 : " + studentno + ", " + "국적 : " + country + "]");
	}
	
	ForeignStudent(String name, int age, int studentno, String country){
		super(name, age, studentno);
		this.country = country;
	}
}
