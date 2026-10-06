package chap7Challenge_i;

public class Bird implements Countable{
	String name;
	int count;
	
	public Bird(String name, int count) {
		this.name = name;
		this.count = count;
	}


	void fly() {
		System.out.println(count + "마리 " + name + "가 날아간다.");
	}
	
	@Override
	public void count() {
		System.out.println(name + "가 " + count + "마리 있다.");
	}
}
