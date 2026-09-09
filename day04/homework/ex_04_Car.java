package homework;

public class ex_04_Car {
	private static int numOfCar = 0;
	private static int numOfRedCar = 0;
	private String color;
	
	public ex_04_Car(String color) {
		this.color = color.toLowerCase();
		numOfCar++;
		if(color.toLowerCase().equals("red"))
			numOfRedCar++;
	}
	
	public static int getNumOfCar() {
		return numOfCar;
	}
	
	public static int getNumOfRedCar() {
		return numOfRedCar;
	}
}
