import java.util.ArrayList;

public class PrimeNumGen {

	public ArrayList generate(Integer input) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		if(input <= 2){
			return primes;
		}else{
			primes.add(2);
			if (input >3){
				primes.add(3);
			}
		}
		return primes;
	}

}
