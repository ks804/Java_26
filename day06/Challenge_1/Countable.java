package chap7Challenge_a;

public abstract class Countable {
	protected String name;
	protected int num;
	
	Countable(){}
	
	Countable(String name, int num){
		this.name = name;
		this.num = num;
	}
	
	abstract void count();
}
