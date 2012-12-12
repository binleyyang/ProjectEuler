import java.util.ArrayList;
import java.math.BigInteger;
import java.util.HashSet;

public class Problem29 {
	
	public static void main (String[] args) {
		
		ArrayList<BigInteger> a = new ArrayList<BigInteger>();
		BigInteger x = new BigInteger("100");
		
		for (BigInteger i = BigInteger.valueOf(2); i.compareTo(x) <= 0; i=i.add(BigInteger.ONE)) {
			for (int m = 2; m <= 100; m++) {
				a.add(i.pow(m));
			}
		}
		
		HashSet h = new HashSet();
		h.addAll(a);
		a.clear();
		a.addAll(h);
		
		System.out.println("The total number of distinct numbers is " + a.size());
	}
}
