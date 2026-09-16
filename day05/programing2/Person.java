package programing2;

public class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void show() {
		System.out.println("[이름 : " + name + ", " + "학번 : " + age + "]");
	}
}
