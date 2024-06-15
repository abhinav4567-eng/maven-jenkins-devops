package mypkg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClassCalculator {
	
	Calculator ob = new Calculator();
	
	@Test
	public void test_sum() {
		assertEquals(15, ob.sum(10, 5));
	  
	}
	
	@Test
	public void test_sub( ) {
		assertEquals(5, ob.sub(10, 5));
	}
	
	@Test
	public void test_mul() {
		assertEquals(50, ob.mul(10, 5));
	}
	
	@Test
	public void test_div() {
		assertEquals(2, ob.div(10, 5));
	}
	
	@Test
	public void test_mod() {
		assertEquals(0, ob.mod(10, 5));
		
	}
	
	

}
