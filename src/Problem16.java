import java.math.BigInteger;
import java.util.ArrayList;

public class Problem16 {
	
	public static void main (String[] args) {
		
		BigInteger number = new BigInteger("2");
		BigInteger multiplier = new BigInteger("2");
		for (int i = 1; i < 1000; i++) {
			number = number.multiply(multiplier);
			System.out.println("Number: " + number);
			System.out.println("Sum: " + sum(number));
			System.out.println();
		}
		
		System.out.println("The sum of the digits of 2^1000 is " + sum(number));
	}
	
	private static int sum (BigInteger x) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		BigInteger ten = new BigInteger("10");
		while (!x.equals(BigInteger.ZERO))
		{
		    list.add(0, x.mod(ten).intValue());
		    x = x.divide(ten);
		}

		int sum = 0;

		for (int i = 0; i < list.size(); i++){
			sum+=list.get(i);
		}
		return sum;
	}
}
