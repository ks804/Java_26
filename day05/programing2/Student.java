package programing2;

public class Student extends Person{
	int studentno;
	
	Student(String name, int age, int studentno){
		super(name, age);
		this.studentno = studentno;
	}
	@Override
	void show() {
		System.out.println("[이름 : " + name + ", " + "나이 : " + age + ", " + "학번 : " + studentno + "]");
	}
	
	
}
