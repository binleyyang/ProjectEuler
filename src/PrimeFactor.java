public class PrimeFactor {
	
	public static void main (String[] args) {
		
		long number = 600851475143L;
		System.out.println("The greatest prime factor of " + number + " is " + prime(number) + ".");
	}
	
	private static int prime(long x) {
		int max = 0, factor = 0;
		for (int i = 1; i < x; i++) {
			if (x % i == 0) {
				factor = (int)x / i;
				if (primecheck(factor) == true) {
					if (factor > max)
						max = factor;
				}
			}
		}
		return max;
	}
	
	public static boolean primecheck(int x){
		
		for (int counter = 2; counter < x; counter++){
			if (x % counter == 0)
				return false;
		}
		return true;
	}
}
