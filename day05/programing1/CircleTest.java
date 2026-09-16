package programing1;

public class CircleTest {

	public static void main(String[] args) {
		Circle[] circles = {new Circle(5), new ColoredCircle(10, "빨간색")};
		
		for (Circle c : circles)
			c.show();
	}

}
