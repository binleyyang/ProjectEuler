
public class Problem7 {
	
	public static void main (String[] args) {
		int counter = 0;
		for (int i = 2; i <= 10000000; i++) {
			if (primecheck(i) == true){
				counter++;
			}
				if (counter == 10001) {
					System.out.println("The " + counter + "st prime number is " + i);
					break;
				}
		}
	}
	
	public static boolean primecheck(int x){

		for (int counter = 2; counter < x; counter++){
			if (x % counter == 0)
				return false;
		}
		return true;
	}
}
