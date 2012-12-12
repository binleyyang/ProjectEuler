import java.util.Arrays;

public class Digits {
	
	public static void main (String[] args) {
		printer(digits(12345));
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
