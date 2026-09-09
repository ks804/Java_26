package homework;

public class ex_04_CarTest {
	public static void main(String[] args) {
		ex_04_Car c1 = new ex_04_Car("red");
		ex_04_Car c2 = new ex_04_Car("blue");
		ex_04_Car c3 = new ex_04_Car("RED");
		
		System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d",
							ex_04_Car.getNumOfCar(), ex_04_Car.getNumOfRedCar());
	}
}
