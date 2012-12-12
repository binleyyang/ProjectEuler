import java.util.ArrayList;

public class Problem23 {
	
	public static void main (String[] args) {
		System.out.println(abundantNumber(6));
	}
	
	public static int add (ArrayList<Integer> x) {
		int a = 0;
		
		for (int i = 0; i < x.size(); i++) {
			a += x.get(i);
		}
		
		return a;
	}
	
	public static ArrayList<Integer> divisor (int x) {
		ArrayList<Integer> divisors = new ArrayList<Integer>();
		
		for (int i = 1; i < x; i++) {
			if (x % i == 0)
				divisors.add(i);
		}
		return divisors;
	}
	
	public static boolean abundantNumber (int x) {
		int a = add(divisor(x));
		if (add(divisor(a)) > x && a != x)
			return true;
		else
			return false;
	}
}
