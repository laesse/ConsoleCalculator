package ch.bbw.vola.consoleCalc;

import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;

import javafx.beans.binding.IntegerBinding;

public class CalculatorTest {
	Calculator testee;

	@Before
	public void setUp() throws Exception {
		testee = new Calculator();
	}

	@Test
	public void testAddition() {
		assertTrue("Test: summe(1,2) == 3 failed", testee.summe(1, 2) == 3);
		assertTrue("Test: summe(1,-2) == -1 failed", testee.summe(1, -2) == -1);
		assertTrue("Test: summe(-1,-2) == -3 failed", testee.summe(-1, -2) == -3);
		assertTrue("Test: summe(1.1294,2.344) == 3.4734 failed", testee.summe(1.1294, 2.344) == 3.4734);
		assertEquals("Test: summe(2.141, 1.1278) ==  3.2688 failed", testee.summe(2.141, 1.1278), 3.2688,0.000000000001);
		assertTrue("Test: summe(Integer.MAX_VALUE,Integer.MAX_VALUE)==Integer.MAX_VALUE * 2 failed",
				testee.summe(Integer.MAX_VALUE, Integer.MAX_VALUE) == Integer.MAX_VALUE * 2);
		System.out.println( Integer.MAX_VALUE * 2);
		assertTrue("Test: summe(Integer.MAX_VALUE,Integer.MIN_VALUE)==-1 failed",
				testee.summe(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
	}

}
