import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public static List<Integer> generate(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int number = 2;i > 1; number++) {

			for (; i % number == 0; i /= number) {
				primes.add(number);
			}
		}
		return primes;
	}

}
