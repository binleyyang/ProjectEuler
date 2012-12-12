import java.util.Arrays;

public class Problem34 {

	public static void main (String[] args) {
		
		for (int i = 3; i < 10000000; i++) {
			if (factorial(digits(i)) ==  i)
				System.out.println(i + " is equal the factorial of its digits");
		}
	}
	
	public static int factorial (int[] a) {	
		int sum = 0;
		int factorial = 1;
		
		for (int i = 0; i < a.length; i++) {
			factorial *= a[i];
			sum += factorial;
		}
		return sum;
	}
	
	public static int[] digits (int x) {
		
		String p = Integer.toString(x);
		char[] charArray = p.toCharArray();
		int[] array = new int[charArray.length];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(Character.toString(charArray[i]));
		}
		return array;
	}
}
