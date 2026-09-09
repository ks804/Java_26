package cat;

public class Cat {
	
	
	String breed;
	String color;
	
	public Cat() {
		
	}
	
	public Cat(String breed, String color) {
		this.breed = breed;
		this.color = color;
	}
	
	void eat(String time) {
	    System.out.println(time + "에 사료를 먹습니다.");
	}

	void scratch() {
	    System.out.println("스크래치를 긁습니다.");
	}

	void meow() {
	    System.out.println("멍멍");
	}
	
	void setColor(String breed, String color) {
		this.breed = breed;
		this.color = color;
	}
	
	void Cat(String breed) {
		this.breed = breed;
	}
}
