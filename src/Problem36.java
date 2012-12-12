import java.util.ArrayList;
import java.math.BigInteger;

public class Problem36 {
	
	public static void main (String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 1000000; i++) {
			BigInteger binaryValue = new BigInteger(Integer.toBinaryString(i));
			if (checker(BigInteger.valueOf(i)) == true && checker(binaryValue) == true)
				sum += i;
		}
		
		System.out.println("The sum of all numbers < 1,000,000 that are palindromic in base 10 and base 2 is " + sum);
	}
	
	public static ArrayList<Integer> digits (BigInteger a) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		while (!a.equals(BigInteger.ZERO)) {
			numbers.add(0, a.mod(BigInteger.TEN).intValue());
			a = a.divide(BigInteger.TEN);
		}
		
		return numbers;
	}
	
	public static boolean checker (BigInteger a) {
		ArrayList<Integer> x = digits(a);
		Integer[] list = x.toArray(new Integer[0]);
		int count = 0;
		
		for (int i = 0; i < list.length/2; i++) {
			if (list[i] == list[list.length-i-1])
				count++;
		}
		if (count == list.length/2)
			return true;
		
		return false;
	}
}
