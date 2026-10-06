package animal2;

public class AnimalTest {
	public static void main(String[] args) {
		printDayLifr(new Tiger());
	}
	
	public static void printDayLifr(Animal a) {
		a.eat();
		a.move();
		a.sleep();
	}
}
