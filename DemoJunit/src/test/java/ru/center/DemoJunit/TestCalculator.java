package ru.center.DemoJunit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;// можно  *
import org.mockito.Mockito;// можно  *
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.*;// добавить для when
public class TestCalculator {

	// TODO Auto-generated method stub


	Calculator c = null;
	@Mock
	CalculatorService service;// = mock(CalculatorService.class);
//	CalculatorService service = Mockito.mock(CalculatorService.class);
// после импорта satic Mockito... для when можно убрать класс Mockito
	// mock() - метод принадлежит классу Mockito к
// тест снова пройдет - но опять фейл		
	@Rule public MockitoRule rule = MockitoJUnit.rule(); // Взаимодействие с JUnit
	// Теперь после пройдет
	@Before
	public void setUp() {
		c = new Calculator(service);
	}
	@Test
	public void testPerfom() {
		// import static org.mockito.Mockito.*;
		when(service.add(2, 3)).thenReturn(5); // тест пройдет успешно
		assertEquals(10, c.perform(2,3));
		verify(service).add(2, 3);
	}
//@Test
//	public void test() {
//		assertEquals(4, c.add(2,2));
//	}
//

}
