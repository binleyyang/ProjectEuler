import java.util.ArrayList;

public class TriangleNumbers {
	
	public static void main (String[] args) {
		
		ArrayList<Integer> triangle = triangle(5);
		for (int i = 1; i < 200000; i++) {
			System.out.println(triangle.get(i) + ":" + divisor(triangle.get(i)));
			if (divisor(triangle.get(i)) > 500) {
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
	
	private static int divisor(int a) {
		int count = 0;
		for(int i = 1; i <= a; i++) {
			if (a % i == 0) 
				count += 1;
		}
		return count;
	}
}
