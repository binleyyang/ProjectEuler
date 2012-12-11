import java.util.ArrayList;

public class Problem21 {
	
	public static void main (String[] args) {
		
		int sum = 0;
		for (int i = 1; i < 10000; i++) {
			if (determine(i) == true) {
				System.out.println(i + " : " + divisor(i));
				sum += i;
			}
		}
		
		System.out.println("The sum of amicable pairs under 10,000 is " + sum);
	}
	
	public static ArrayList<Integer> divisor (int x) {
		ArrayList<Integer> divisors = new ArrayList<Integer>();
		
		for (int i = 1; i < x; i++) {
			if (x % i == 0)
				divisors.add(i);
		}
		return divisors;
	}
	
	public static int add (ArrayList<Integer> x) {
		int a = 0;
		
		for (int i = 0; i < x.size(); i++) {
			a += x.get(i);
		}
		
		return a;
	}
	
	public static boolean determine (int x) {
		int b = add(divisor(x));
		
		if (add(divisor(b)) == x && x != b)
			return true;
		else
			return false;
	}
}
