
public class Problem7 {
	
	public static void main (String[] args) {
		int counter = 0;
		for (int i = 2; i <= 10000000; i++) {
			if (primeChecker(i) == true){
				counter++;
			}
				if (counter == 10001) {
					System.out.println("The " + counter + "st prime number is " + i);
					break;
					
				}
		}
	}
	
	public static boolean primeChecker(int x){

		for (int count = 2; count < x; count++){
			if (x % count == 0)
				return false;
		}
		return true;
	}
}
