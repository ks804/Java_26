package chap7Challenge_a;

public class Bird extends Countable{
	public Bird(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	void fly() {
		System.out.println(num + "마리 " + name + "가 날아간다.");
	}
	
	@Override
	void count() {
		System.out.println(name + "가 " + num + "마리 있다.");
	}
}
