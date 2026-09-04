package homework_ch_5;

import java.util.Scanner;

public class programing_05 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		int[] histogram =  new int[10];
		
       
		System.out.println("숫자를 10개 입력하세요.");
		
		for (int i = 0; i < 10; i++) {
			int num = in.nextInt();
			
			if (num >= 0 && num <= 99) {
				histogram[num/10]++;
			}
        }
		
		for (int i = 0; i < 10; i++) {
			System.out.println((i * 10) + " ~ " + (i * 10 + 9));
			for (int j = 0; j < histogram[i]; j++) {
				System.out.println("*");
			}
		}
    }
}
