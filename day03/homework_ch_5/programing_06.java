package homework_ch_5;

public class programing_06 {
	
	public static int[] reverse(int[] org) {

	    int[] a = new int[org.length];

	    for (int i = 0; i < org.length; i++) {
	        a[i] = org[org.length - 1 - i];
	    }

	    return a;
	}
}
