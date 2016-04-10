package euler;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

public class Test6 {
	
	@Test
	public void test0(){
		assertEquals(Problem6.squares(BigInteger.valueOf(0)).intValue(), 0);
	}
	
	@Test
	public void test10(){
		assertEquals(Problem6.squares(BigInteger.valueOf(10)).intValue(), 2640);
	}
	
	@Test
	public void testSolution(){
		assertEquals(Problem6.squares(BigInteger.valueOf(100)).intValue(), 25164150);
	}

}
