package method;

public class MethodTest {

	public static void main(String[] args) {
	    int[] numArr = {3, 6, 2, 4, 8};
	    
	    System.out.println("getSum의 결과값 = " + getSum(numArr));

	}

	public static int getSum(int[] numArr) {
	    
	    int sum = 0;
	    
	    for (int i = 0; i < numArr.length; i++) {
	        sum += numArr[i];
	    }
	    
	    return sum;
	}

	public static int getMax(int[] numArr) {
	    int max = numArr[0];
	    
	    return max;
	}

}
