package programing6;

public class Vehicle {
	String color; //자동차 색상
	int speed; //자동차 속도
	
	void show() {
		System.out.println("부릉부릉이 색상 : " + color);
		System.out.println("부릉부릉이 속도 : " + speed);
	}
	
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
}
