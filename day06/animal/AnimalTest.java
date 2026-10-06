package animal;

public class AnimalTest {
	public static void main(String[] args) {
//		Animal a = new Tiger();
//		printDayLifr(a);
//		a = new Goldfish();
//		printDayLifr(a);
		
		Animal[] animals = {new Tiger(), new Goldfish(), new Tiger(), new Eagle()};
		
		for(Animal a : animals) {
			printDayLifr(a);
		}
	}
	
	public static void printDayLifr(Animal a) {
		System.out.println(a);
		a.eat();
		a.move();
		a.sleep();
	}
}
