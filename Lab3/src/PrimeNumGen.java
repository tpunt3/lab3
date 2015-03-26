import java.util.ArrayList;

public class PrimeNumGen {

	public ArrayList generate(Integer input) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		if(input > 2){
			primes.add(2);
		}
		return primes;
	}

}
