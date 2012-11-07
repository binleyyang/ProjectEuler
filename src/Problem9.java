import java.lang.Math;
public class Problem9 {
	
	public static void main (String[] args) {
		
		int sum = 0, product = 1;
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 1000; j++) {
				int csquared = i*i + j*j;
				int b = (int)Math.pow(csquared, .5);
				if(Math.ceil(b) - b == 0) {
					sum += i + j + b;
					if(sum == 1000) {
						product = i*j*b;
						System.out.println("The product of abc when a + b + c = 1000 is " + product);
					}
				}
			}
		}
	}
}
