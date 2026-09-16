package circle;

public class Overriding {
	
	public static void main(String[] args) {
		
		System.out.println(">>> 원 : ");
		Circle c  = new Circle(5.0);
		printCircleInfo(new Circle(5.0));
		
		System.out.println(">>> 구(ball) : ");
		Circle b  = new Circle(5.0);
		printCircleInfo(b);
		
		
		System.out.println(">>> 원기둥 : ");
		Cylinder cy = new Cylinder(5.0, 7.0);
		printCircleInfo(cy);
	}
	
	public static void printCircleInfo(Circle c) {
		System.out.println("반지름 : " + c.getRadius());
		System.out.println("면적 : " + c.getArea());
	}
}
