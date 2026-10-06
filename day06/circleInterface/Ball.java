package circleInterface;

public class Ball implements CircleTemplate{
	private double radius;
	
	public Ball(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return 4 * PI * radius * radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
