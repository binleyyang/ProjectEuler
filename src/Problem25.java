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
	
	public static String converter (BigInteger x) {
		String s = String.valueOf(x);
		return s;
	}
	
	public static int[] number(String x){
		long z = Long.parseLong(x);
		int y = x.length() - 1;

		int [] array = new int[y+1];

		for (int counter = y; counter >= 0; counter--) {

			double a = z / (Math.pow(10, counter));

			int b = (int)(Math.ceil(a) - 1);
			if (counter == 0){
				b = b+1;
			}
			array[y-counter]=b;
			z = (int)(z - (b*Math.pow(10, counter))); 
		}	
		return array;
	}
	
	public static void printer(int[] a) { //method to print a 1D array
		System.out.print("[");
		for (int row = 0; row < a.length; row++) {
			System.out.print(a[row]);
			System.out.print(",");
		}
		System.out.println("]");
		//System.out.println();
	}
}
