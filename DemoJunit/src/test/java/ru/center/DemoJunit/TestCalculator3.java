package ru.center.DemoJunit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;// добавить для when
public class TestCalculator3 {

	Calculator c = null;
	CalculatorService service = mock(CalculatorService.class);
//	CalculatorService service = Mockito.mock(CalculatorService.class);
// после импорта satic Mockito... для when можно убрать класс Mockito
	// mock() - метод принадлежит классу Mockito к
// тест снова пройдет - но опять фейл		
	@Before
	public void setUp() {
		c = new Calculator(service);
	}
	@Test
	public void testPerfom() {
		// import static org.mockito.Mockito.*;
		when(service.add(2, 3)).thenReturn(5); // тест пройдет успешно
		assertEquals(10, c.perform(2,3));
	}
//@Test
//	public void test() {
//		assertEquals(4, c.add(2,2));
//	}
//
}
