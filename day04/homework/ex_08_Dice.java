package homework;

public class ex_08_Dice {
	int[] face = {1, 2, 3, 4, 5, 6};
	
	public int roll() {
		double n = Math.random()*10;
		if(n <= 1.66) {
			return face[0];
		}else if(n <= 3.33) {
			return face[1];
		}else if(n <= 5) {
			return face[2];
		}else if(n <= 7.66) {
			return face[3];
		}else if(n <= 8.33) {
			return face[4];
		}else {
			return face[5];
		}
	}
}
