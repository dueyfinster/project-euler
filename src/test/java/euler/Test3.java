package euler;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Ignore;
import org.junit.Test;

public class Test3 {
	
	@Test
	public void testSample(){
		BigInteger numToTest = BigInteger.valueOf(13195);
		assertEquals(Problem3.findLargestPrimeFactor(numToTest), 29);
	}
	
	@Test
	@Ignore
	public void testSolution(){
		BigInteger numToTest = new BigInteger("600851475143");
		assertEquals(Problem3.findLargestPrimeFactor(numToTest), 22);
	}

}
