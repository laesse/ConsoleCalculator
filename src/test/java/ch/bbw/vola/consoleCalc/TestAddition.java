package ch.bbw.vola.consoleCalc;

import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;

import ch.bbw.consoleCalc.Calculator;

public class TestAddition {
	Calculator testee;

	@Before
	public void setUp() throws Exception {
		testee = new Calculator();
	}

	@Test
	public void testAddition123() {
		assertTrue("Test: summe(1,2) == 3 failed", testee.summe(1, 2) == 3);
	}

	@Test
	public void testAddition12N1N() {
		assertTrue("Test: summe(1,-2) == -1 failed", testee.summe(1, -2) == -1);
	}

	@Test
	public void testAdition1N2N3N() {
		assertTrue("Test: summe(-1,-2) == -3 failed", testee.summe(-1, -2) == -3);
	}
	
	@Test
	public void testAdition101() {
		assertTrue("Test: summe(-1,-2) == -3 failed", testee.summe(1, 0) == 1);
	}

	@Test
	public void testAditionDouble() {
		assertEquals("Test: summe(2.141, 1.1278) ==  3.2688 failed", testee.summe(2.141, 1.1278), 3.2688,
				0.000000000001);
	}

	@Test(expected=ArithmeticException.class)
	public void testAditionMaxValue2() {
		
		assertTrue("Test: summe(Integer.MAX_VALUE,Integer.MAX_VALUE)==Integer.MAX_VALUE * 2 failed",
				testee.summe(Integer.MAX_VALUE, Integer.MAX_VALUE) == 0);
	}

	@Test
	public void testAditionMaxValueMinValue() {
		assertTrue("Test: summe(Integer.MAX_VALUE,Integer.MIN_VALUE)==-1 failed",
				testee.summe(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
	}

}
