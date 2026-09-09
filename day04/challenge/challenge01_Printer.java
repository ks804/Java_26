package challenge;

public class challenge01_Printer {
	int numOfPapers = 100;
	
	public void print(int amount) {
        numOfPapers -= amount;
    }
}
