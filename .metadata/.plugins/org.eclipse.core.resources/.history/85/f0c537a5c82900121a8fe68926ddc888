
public class Problem16 {

	public static void main(String[] args) {
		int listed[] = lister(convert((long) Math.pow(2, 1000)));
		long sum = 0;
		for (int i = 0; i<listed.length;i++){
			sum+=listed[i];
			System.out.println(listed[i] + " : " + sum);
		}
		System.out.println("The sum is " + sum);
	}
	
	public static String convert (long x) {
		return Long.toString(x);
	}

	public static int[] lister(String x){
		long z = Long.parseLong(x);
		int y = x.length() - 1;
		
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
		return array;
	}
}
