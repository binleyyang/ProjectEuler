import java.math.*;

public class Problem48 {

	public static void main (String[] args) {
		
		BigInteger sum = new BigInteger("0");
		BigInteger number = new BigInteger("1000");		
		for (int i = 1; i <= 1000; i++) {
			sum = sum.add(BigInteger.valueOf(i).pow(i));
		}	
		System.out.println("The sum of the series is: " + sum);
	}
}
