public class PrimeFactor {
	
	public static void main (String[] args) {
		
		long number = 600851475143L;
		System.out.println("The greatest prime factor of " + number + " is " + prime(number) + ".");
	}
	
	private static long prime(long x) {
		long max = 0;
		long factor = 0;
		for (long i = 1; i < x; i++) {
			if (x % i == 0) {
				factor = x / i;
				System.out.println(factor);
				if (primecheck(factor) == true && i != 1) {
					if (factor > max) {
						max = factor;
						System.out.println(max);
					}
				}
			}
		}
		return max;
	}
	
	public static boolean primecheck(long x){
		
		for (int counter = 2; counter < x; counter++){
			if (x % counter == 0)
				return false;
		}
		return true;
	}
}
