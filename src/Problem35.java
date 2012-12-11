public class Problem35 {
	
	public static void main (String[] args) {
		
		int counter = 0;
		int counter2 = 0;
		
		for (int i = 2; i < 100; i++) {
			int[] array2 = number(i);
			printer(array2);
			for (int j = 0; j < array2.length; j++) {
				if (primecheck(array2[j]) == true) {
					counter2++;
					//System.out.println(counter2);
					if (counter2 == array2.length) {
						counter++;
						System.out.println(counter);
					} else
						System.out.println("This is not a circular prime");
				}	
			}
		}
		System.out.println("The number of circular primes below 1000000 is " + counter);
	}
	
	public static int[] number(int x) {
		String t = Integer.toString(x);
		int z = x;
		int y = t.length() - 1;

		int [] array = new int[y+1];

		for (int counter = y; counter >= 0; counter--) {

			double a = z / (Math.pow(10, counter));

			int b = (int)(Math.ceil(a) - 1);
			if (counter == 0){
				b = b+1;
			}
			array[y-counter]=b;
			z = (int)(z - (b*Math.pow(10, counter))); 
		}
		if(array[array.length-1]==10){
			array[array.length-2]+=1;
			array[array.length-1]=0;
		}
		return array;
	}
	
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
