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
		ArrayList<Integer> expected2 = new ArrayList<Integer>();
		expected2.add(2);
		expected2.add(3);
		ArrayList<Integer> expected3 = new ArrayList<Integer>();
		expected3.add(2);
		expected3.add(3);
		expected3.add(5);
		ArrayList<Integer> expected4 = new ArrayList<Integer>();
		expected4.add(2);
		expected4.add(3);
		expected4.add(5);
		expected4.add(7);
		expected4.add(11);
		expected4.add(13);
		ArrayList<Integer> expected5 = new ArrayList<Integer>();
		expected5.add(2);
		expected5.add(3);
		expected5.add(5);
		expected5.add(7);
		expected5.add(11);
		expected5.add(13);
		expected5.add(17);
		expected5.add(19);
		expected5.add(23);
		expected5.add(29);
		expected5.add(31);
		expected5.add(37);
		expected5.add(41);
		expected5.add(43);
		expected5.add(47);
		expected5.add(53);
		expected5.add(59);
		expected5.add(61);
		expected5.add(67);
		expected5.add(71);
		expected5.add(73);
		expected5.add(79);
		expected5.add(83);
		expected5.add(89);
		expected5.add(97);
		return Arrays.asList(new Object[][]{
			{2, expected},
			{3,expected1},
			{4,expected2},
			{6,expected3},
			{14,expected4},
			{100,expected5}
			
		});
	}
	
	@Test
	public void TestPrimeNumGen(){
		System.out.println("parameterized num is : " + input);
		assertEquals(expected, primeNumGen.generate(input));
	}

}
