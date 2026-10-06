package chap7Challenge_i;

public class Tree implements Countable{
	String name;
	int count;
	
	public Tree(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	
	
	void rpen() {
		System.out.println(name + "에 열매가 잘 익었다.");
	}
	
	@Override
	public void count() {
		System.out.println(name + "가 " + count + "그루 있다.");
	}
	
	
}
