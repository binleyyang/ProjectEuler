
public class Problem20 {
	
	public static void main (String [] args) {
		
		int x = 100;
		System.out.println("The factorial of " + x + " is " + factorial(x));
		System.out.println("The sum of the digits of the factorial of " + x + " is " + sum(factorial(x)));
		
	}

	private static long factorial (int x) {
		long product = 1;
		for (int i = 1; i <= x; i++) {
			product *= i;
		}
		return product;
	}
	
	private static double sum (long x) {
		int[] array = lister(convert(x));
		double sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public static String convert (long x) {
		return Long.toString(x);
	}

	public static int[] lister(String x){
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
}
