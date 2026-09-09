package challenge;

public class challenge03_Printer {
	private int numOfPapers;
	private boolean duplex;
	
	public challenge03_Printer(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}
	
	public void print(int amount) {
		
		int papers;
		
		if (duplex) {
            papers = (amount + 1) / 2;
        } else {
            papers = amount;
        }

        if (numOfPapers >= papers) {
            numOfPapers -= papers;

            if (duplex) {
                System.out.println(
                    "양면으로 " + papers + "장 출력했습니다. 현재 "
                    + numOfPapers + "장 남아 있습니다."
                );
            } else {
                System.out.println(
                    "단면으로 " + papers + "장 출력했습니다. 현재 "
                    + numOfPapers + "장 남아 있습니다."
                );
            }

        } else {
            int shortage = papers - numOfPapers;

            if (duplex) {
                System.out.println(
                    "양면으로 모두 출력하려면 용지가 "
                    + shortage + "매 부족합니다. "
                    + numOfPapers + "장만 출력합니다."
                );
            } else {
                System.out.println(
                    "단면으로 모두 출력하려면 용지가 "
                    + shortage + "매 부족합니다. "
                    + numOfPapers + "장만 출력합니다."
                );
            }

            numOfPapers = 0;
        }
	}
	
	public boolean getDuplex() {
		return duplex;
	}
	
	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
	
}
