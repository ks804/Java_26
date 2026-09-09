package homework;

public class ex_06_Complex {
	double a;
	double b = 0.0;
	
	public ex_06_Complex(double a) {
		this.a = a;
	}
	
	public ex_06_Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public void print() {
		System.out.println(a + " + " + b + "i");
	}
}
