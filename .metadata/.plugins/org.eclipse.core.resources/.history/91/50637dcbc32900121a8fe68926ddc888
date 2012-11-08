import java.util.ArrayList;
import java.util.Collections;


public class Problem3 {

	public static void main(String[] args) {
		ArrayList<Long> Primes = new ArrayList<Long>();
		for (long i = 1; i <= 600851475143L; i++){
			if(600851475143L % i == 0){
				if(primecheck(i)==true && i!= 1){
					Primes.add(i);
				}
			}
		}
		System.out.println("The greatest prime factor is " + Collections.max(Primes));
	}
	
	public static boolean primecheck(long x){
		for (int counter = 2; counter < x; counter++){		
			if (x % counter == 0)
				return false;
		}
		return true;
	}
}
