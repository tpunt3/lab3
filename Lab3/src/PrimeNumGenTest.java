import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumGenTest {
	private Integer input;
	private ArrayList<Integer> expected;
	private PrimeNumGen primeNumGen;
	
	@Before
	public void initialize(){
		primeNumGen = new PrimeNumGen();
	}
	
	public PrimeNumGenTest(Integer input, ArrayList<Integer> expected){
		this.input = input;
		this.expected = expected;
	}
	
	@Parameterized.Parameters
	public static Collection primeNumbers(){
		ArrayList<Integer> expected = new ArrayList<Integer>();
		ArrayList<Integer> expected1 = new ArrayList<Integer>();
		expected1.add(2);
		return Arrays.asList(new Object[][]{
			{2, expected},
			{3,expected1}
			
		});
	}
	
	@Test
	public void TestPrimeNumGen(){
		System.out.println("parameterized num is : " + input);
		assertEquals(expected, primeNumGen.generate(input));
	}

}
