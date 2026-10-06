package chap7Pro_03;

public class Book {
	int price;
	
	public Book(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	void show() {
		System.out.println("Book [price=" + price + "]");
	}
}
