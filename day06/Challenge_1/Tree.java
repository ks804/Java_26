package chap7Challenge_a;

public class Tree extends Countable{
	public Tree(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	void rpen() {
		System.out.println(num + "그루 " + name + "에 열매가 잘 익었다.");
	}
	
	@Override
	void count() {
		System.out.println(name + "가 " + num + "마리 있다.");	
	}
}
