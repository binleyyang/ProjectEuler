import java.util.Arrays;

public class Problem34 {

	public static void main (String[] args) {
		
		for (int i = 3; i < 1000000; i++) {
			if (sum(digits(i)) ==  i) {
				System.out.println(i + " is equal the factorial of its digits");
			}
		}
	}
	
	public static int sum (int[] a) {	

		int sum = 1;
		
		for (int i = 0; i < a.length; i++) {
			sum += factorial(a[i]);
		}
		return sum;
	}
	
	public static int factorial(int a) {
		
		int factorial = 1;
		
		for (int i = 1; i <= a; i++) {
			factorial *= i;
		}
		return factorial;
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
	
	public static void printer(int[] x){
		System.out.println(Arrays.toString(x));
	}
}
