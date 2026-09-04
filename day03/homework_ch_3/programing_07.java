package homework_ch_3;

import java.util.Scanner;

public class programing_07 {

    public static void main(String[] args) {
    	String c = input("철수");
    	String y = input("영희");
    	whoWin(c, y);
    }
	static String input(String name) {
		Scanner in = new Scanner(System.in);
		
		System.out.print(name + " : ");
		String result = in.next();
		
		return result;
	}
	static void whoWin(String c, String y) {
		if (c.equals(y)) {
		System.out.println("무승부");
	} else if ((c.equals("r") && y.equals("s")) ||
			  (c.equals("s") && y.equals("p")) ||
			  (c.equals("p") && y.equals("r"))) {
				  System.out.println("철수, 승!");
			  }
		else {
			System.out.println("영희, 승!");
		}
	}
 }