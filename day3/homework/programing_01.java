package homework;

import java.util.Scanner;

public class programing_01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오 : ");
		int age  = in.nextInt();
		
		if (age >= 19) {
			System.out.println("성년");
		} else {
			System.out.println("미성년");
		}
		
	}

}
