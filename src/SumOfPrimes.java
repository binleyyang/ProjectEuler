
public class SumOfPrimes {
	
	public static void main (String[] args) {
		
		long sum = 0;
		for (int i = 2; i < 2000000; i++) {
			if (primecheck(i) == true) {
				sum += i;
				System.out.println(i + " : " + sum); //tracking the progress of the program
			}
		}
		System.out.println("The sum of all primes below two million is " + sum + "."); //display the answer
		
	}

	public static boolean primecheck(int x) {
		
		for (int counter = 2; counter < x; counter++){
			if (x % counter == 0)
				return false;
		}
		return true;
	}
}
