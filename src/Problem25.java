import java.math.BigInteger;

public class Problem25 {
	
	public static void main (String[] args) {
		
		int counter = -1;
		for (int i = 1; i < 10000; i++) {
			counter++;
			if (fib(i).toString().length() == 1000) {
				System.out.println("The first term to contain 1000 digits in the Fibonacci sequence is " + counter);
				break;
			}
			else {
				System.out.println(counter);
				System.out.println(fib(i).toString());
				System.out.println("Number of digits: " + (fib(i)).toString().length());
				System.out.println();
			}
		}
	}
	
	private static BigInteger fib (int x) {
		BigInteger prev1 = new BigInteger("0");
		BigInteger prev2 = new BigInteger("1");
		for (int i = 1; i < x; i++) {
			BigInteger savePrev = prev1;
			prev1 = prev2;
			prev2 = savePrev.add(prev2);
		}
		return prev1;
	}
}
