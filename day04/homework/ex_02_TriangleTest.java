package homework;

public class ex_02_TriangleTest {
	
	public static void main(String[] args) {
		
		ex_02_Triangle t1 = new ex_02_Triangle(10.0, 5.0);
		ex_02_Triangle t2 = new ex_02_Triangle(5.0, 10.0);
		ex_02_Triangle t3 = new ex_02_Triangle(8.0, 8.0);
		
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
	}
}
