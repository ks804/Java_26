package chap7Pro_08;

import java.util.Scanner;

public class EchoerTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Echoer e = new Echoer() {
			
			@Override
			void echo() {
				String str = in.nextLine();
				System.out.println(str);
			}
		};
		e.start();
		e.echo();
		e.stop();
	}
}
