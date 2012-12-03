import java.util.ArrayList;
import java.math.BigInteger;

public class Problem20 {
	
	public static void main (String [] args) {
		
		BigInteger x = new BigInteger("100");
		System.out.println("The factorial of " + x + " is " + factorial(x) + ".");
		System.out.println("The sum of the digits of the factorial of " + x + " is " + sum(factorial(x)) + ".");
		
	}

	private static BigInteger factorial (BigInteger x) {
		BigInteger product = new BigInteger("1");
		for (BigInteger i = new BigInteger("1"); i.compareTo(x) <= 0; i=i.add(BigInteger.ONE)) {
			System.out.println(i);
			product = product.multiply(i);
			System.out.println("The product is: " + product);
		}
		return product;
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
