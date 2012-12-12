import java.util.ArrayList;

public class TriangleNumbers {
	
	public static void main (String[] args) {
		
		ArrayList<Integer> triangle = triangle(5);
		for (int i = 1; i < 200000; i++) {
			System.out.println(triangle.get(i) + ":" + divisors(triangle.get(i)));
			if (divisors(triangle.get(i)) > 500) {
				System.out.println("The first triangle number to have over 500 divisors is " + triangle.get(i));
			break;
			}
		}
	}
	
	private static ArrayList<Integer> triangle(int x) {
		
		ArrayList<Integer> triangle = new ArrayList<Integer>();
		triangle.add(1);
		int sum = 0;
		for(int i = 1; i < 200000; i++) {
			sum += i;
			triangle.add(sum);
			//System.out.println(triangle.get(i));
		}
		return triangle;
	}
	
	private static int divisors (int x) {
		int counter = 0;
		
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) 
				counter += 1;
		}
		return counter;
	}
}
