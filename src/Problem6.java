import java.lang.Math;

public class Problem6 {
	
	public static void main (String[] args) {
		
		int sum1 = 0, sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			sum1 += (i*i);
			sum2 += i;
		}
		double difference = (sum2 * sum2) - sum1;
		
		System.out.println("The difference between the sum of squares and square of the sum of the first hundred natural numbers is " + difference + ".");
	}
}
