
public class Fibonacci {
	
	public static void main (String [] args) {
		int sum = 0;
		for (int i = 0; i < 46; i++) {
			if(fib(i) < 4000000) {
				if(fib(i) % 2 == 0) {
					sum += fib(i);
				}
			}
		}
		System.out.println("The sum of the even-valued terms of the Fibonacci sequence that do not exceed 4 million is: " + sum + ".");
	}
	
	private static int fib (int x) {
		int prev1 = 0, prev2 = 1;
		for (int i = 0; i < x; i++) {
			int savePrev = prev1;
			prev1 = prev2;
			prev2 = savePrev + prev2;
		}
		return prev1;
	}

}
