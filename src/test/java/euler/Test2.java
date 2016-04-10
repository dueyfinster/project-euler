package euler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test2 {
	
	@Test
	public void test0(){
		assertEquals(Problem2.evenFibonacci(0).intValue(), 0);
	}
	
	@Test
	public void test10(){
		assertEquals(Problem2.evenFibonacci(10).intValue(), 10);
	}
	
	@Test
	public void test100(){
		assertEquals(Problem2.evenFibonacci(100).intValue(), 188);
	}
	
	@Test
	public void testSolution(){
		assertEquals(Problem2.evenFibonacci(4000000).intValue(), 4613732);
	}

}
