import java.util.ArrayList;

public class PrimeNumGen {

	public ArrayList generate(Integer input) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int i=2; i < input; i++){
			boolean isprime=true;
			for(int k = 2;k < i; k++){
				System.out.println("i = " + i + " and k = " + k);
				if(i%k==0){
					isprime=false;
				}
			}
			if(isprime) primes.add(i);
		}
		
		return primes;
	}

}
