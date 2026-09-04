package homework_ch_5;

public class programing_01 {
	
	static int countChar(String s, char c) {
	    int count = 0;

	    for (int i = 0; i < s.length(); i++) {
	        if (s.charAt(i) == c) {
	            count++;
	        }
	    }

	    return count;
	}
}
