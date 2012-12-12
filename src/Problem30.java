
public class Problem30 {
	
	public static void main (String[] args) {
		int sum = 0;
		for (int i = 2; i < 1000000; i++) {
			if (digits(i) == true) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("The sum of all the numbers that can be written as the sum of fifth powers of their digits is " + (sum));
	}

	public static boolean digits (int x) {
		
		String p = Integer.toString(x);
		char[] charArray = p.toCharArray();
		int[] array = new int[charArray.length];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(Character.toString(charArray[i]));
		}
		
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += Math.pow(array[i], 5);
		}
		if (sum == x)
			return true;
		else 
			return false;
	}
}
