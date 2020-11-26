package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConCatTest {

	@Test
	public void test() {
		MyJUnitClass junit = new MyJUnitClass();
		String result = junit.concat("Hello", "World");
		assertEquals("HelloWorld", result);
	}
}
