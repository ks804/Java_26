package chap7Pro_03;

import java.util.Arrays;

public class BookTest {
	public static void main(String[] args) {
		Book[] books = {new Book(15000), new Book(50000), new Book(20000)};
	
		System.out.println("정렬 전");
		for(Book b : books) {
			b.show();
		}
		
		System.out.println("정렬 후");
		
		for(int i = 0 ; i < books.length ; i++) {
			for(int j = 0 ; j < books.length ; j++) {
				if(books[i].getPrice() < books[j].getPrice()) {
					Book temp = books[i];
					books[i] = books[j];
					books[j] = temp;
				}
			}
		}
		
		for(Book b : books) {
			b.show();
		}
		
	}
}