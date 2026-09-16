package programing6;

public class Car extends Vehicle{
	int displacement; //자동차 배기량
	int gears;	//자동차 기어 단수
	
	void show() {
		System.out.println("부릉부릉이 배기량 : " + displacement);
		System.out.println("부릉부릉이 기어 단수 : " + gears);
	}
	
	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
}
