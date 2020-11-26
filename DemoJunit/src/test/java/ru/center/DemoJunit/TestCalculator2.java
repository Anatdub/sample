package ru.center.DemoJunit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator2 {

	Calculator c = null;
	CalculatorService service = new CalculatorService() {

		@Override
		public int add(int i, int j) {
			// TODO Auto-generated method stub
			return 5;
		} //Fake class
		
	};
	@Before
	public void setUp() {
		c = new Calculator(service);
	}
	@Test
	public void test() {
		assertEquals(10, c.perform(2,3));
	}
//@Test
//	public void test() {
//		assertEquals(4, c.add(2,2));
//	}
//
}
