package challenge;

public class challenge03_PrinterTest {
	public static void main(String[] args) {
		challenge03_Printer p = new challenge03_Printer(20, true);
		
		p.print(25);
		p.setDuplex(false);
		p.print(10);
	}
}
