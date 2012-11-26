public class Problem35 {
	
	public static void main (String[] args) {
		
		int counter = 0;
		
		for (int i = 1; i < 10000000; i++) {
			int[] array2 = digits(i);
			//printer(array2);
			for (int j = 0; j < array2.length; j++) {
				if (primecheck(array2[j]) == true) {
					counter++;
					System.out.println(counter);
				}
				else
					counter += 0;
			}
		}
		System.out.println("The number of circcular primes below 1000000 is " + counter);
	}
	
	public static int[] digits (int a) {
		  String string = Integer.toString(a);
		  int[] digits = new int[string.length()];

		  for(int i = 0; i < string.length(); i++){
		    digits[i] = Integer.parseInt(string.substring(i, i+1));
		  }
		  return digits;
	}
	/*public static int[] number (int a) {
		
		String string = Integer.toString(a);
		int[] digits = new int[string.length()];
		int number = Integer.parseInt(string);
		
		for (int i = string.length()-1; i >= 0; i++) {
			double b = a / Math.pow(10, i);
			int rem = (int)(Math.ceil(b) - 1);
			if (i == 0) {
				rem++;
			}
			digits[i] = rem;
			number = (int)(a - (rem*Math.pow(10, i)));
		}
		
		for (int j = digits.length; j <= 1; j--) {
			
		}
		return digits;
		
	}
	*/
	public static boolean primecheck(int x){
			
		for (int counter = 2; counter < x; counter++){
			if (x % counter == 0)
				return false;
		}
		return true;
	}
	
	public static void printer(int[] a) { //method to print a 1D array
		System.out.print("[");
		for (int row = 0; row < a.length; row++) {
			System.out.print(a[row]);
			System.out.print(",");
		}
		System.out.println("]");
		//System.out.println();
	}
}
