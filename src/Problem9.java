import java.lang.Math;
public class Problem9 {
	
	public static void main (String[] args) {
		
		int product = 1;
		for (int i = 1; i < 1000; i++) {
			for (int j = 1; j < 1000; j++) {
				if(Math.pow((i*i + j*j), 0.5) - Math.ceil(Math.pow((i*i + j*j), 0.5)) == 0 && i + j + Math.pow(i*i + j*j, 0.5) == 1000) {
					product = (int) (i*j*(Math.pow(i*i + j*j, 0.5)));
					System.out.println("The product of abc when a + b + c = 1000 is " + product);
				}
			}
		}
	}
}

