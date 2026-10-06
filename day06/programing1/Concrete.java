package chap7Pro_01;

public class Concrete extends Abstract{
	int j;
	
	Concrete(int i, int j){
		super(i);
		this.j = j;
	}
	
	@Override
	void show() {
		System.out.println("i = " + i + ", j = " + j);
	}
}
