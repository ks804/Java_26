package homework_ch_5;

public class programing_07 {

	public static void main(String[] args) {
		
		int[] a = { 3, 2, 4, 1, 5 };
		int[] b = { 3, 2, 4, 1 };
		int[] c = { 3, 2, 4, 1, 5 };
		int[] d = { 2, 7, 1, 8, 2 };
		
		check(a,b);
		check(a,c);
		check(a,d);
	}
	
	public static void check(int[] x, int[] y) {
		if (x.length != y.length) {
			System.out.println(false);
			return;
		}
		for (int i = 0; i < x.length; i++) {
			if (x[i] != y[i]) {
				System.out.println(false);
				return;
			}
		}
		System.out.println(true);
	}

}
