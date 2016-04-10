package euler;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class Test1 {
	
	@Test
	public void test0(){
		assertEquals(Problem1.addMultiples(0), 0);
	}

	@Test
	public void test10(){
		assertEquals(Problem1.addMultiples(10), 23);
	}
	
	@Test
	public void test100(){
		assertEquals(Problem1.addMultiples(100), 2318);
	}
	
	@Test
	public void test1000(){
		assertEquals(Problem1.addMultiples(1000), 233168);
	}
}
