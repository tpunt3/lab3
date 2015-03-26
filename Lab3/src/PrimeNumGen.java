import java.util.ArrayList;

public class PrimeNumGen {

	public ArrayList generate(Integer input) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		if(input >2){
			primes.add(2);
			for (int i=2; i<input;i++){
				if (i%2!=0){
					primes.add(i);
				}
			}
		}
		
		return primes;
	}

}
