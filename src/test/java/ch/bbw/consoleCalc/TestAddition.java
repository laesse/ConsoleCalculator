package ch.bbw.consoleCalc;

import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;

import ch.bbw.consoleCalc.Calculator;

public class TestAddition {
	Calculator testee;

	@Before
	public void setUp() throws Exception {
		testee = new Calculator();
	}
	
	/*
	 * Integer Funktion Tests
	 */

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
	public void testAdition0plus1514() {
		assertTrue("Test: summe(-1,-2) == -3 failed", testee.summe(0, 1514) == 1514);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testAditionMaxValue2() {
		assertTrue("Test: summe(Integer.MAX_VALUE,Integer.MAX_VALUE)==Integer.MAX_VALUE * 2 failed",
				testee.summe(Integer.MAX_VALUE, Integer.MAX_VALUE) == 0);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testAditionMinValue2() {
		assertTrue("Test: summe(Integer.MAX_VALUE,Integer.MAX_VALUE)==Integer.MAX_VALUE * 2 failed",
				testee.summe(Integer.MIN_VALUE, -1) == 0);
	}

	@Test
	public void testAditionMaxValueMinValue() {
		assertTrue("Test: summe(Integer.MAX_VALUE,Integer.MIN_VALUE)==-1 failed",
				testee.summe(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
	}
	
	/*
	 *  Double Funktion Tests
	 */

	@Test
	public void testAditionDoublePlusPlus() {
		assertEquals(testee.summe(2.141, 1.1278), 3.2688,
				0.000000000001);
	}
	
	@Test
	public void testAditionDoublePlusMinus() {
		assertEquals( testee.summe(115.31, -325.1278), -209.8178,
				0.000000000001);
	}
	
	@Test
	public void testAditionDoubleMinusMinus() {
		assertEquals( testee.summe(-134.5413, -798.3542245), -932.8955245,
				0.000000000001);
	}
	
	@Test
	public void testAditionDouble0PlusZahl() {
		assertEquals( testee.summe(0, 15.2), 15.2,
				0.000000000001);
	}
	
	@Test
	public void testAditionDoubleZahlPlus0() {
		assertEquals( testee.summe(8316.215,0), 8316.215,
				0.000000000001);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testAditionDoubleMaxPlusMax() {
		assertEquals( testee.summe(Double.MAX_VALUE,Double.MAX_VALUE), Double.POSITIVE_INFINITY,
				0.000000000001);
	}
	
	@Test
	public void testAditionDoubleMinPlusNegZahl() {
		assertEquals(testee.summe(Double.MIN_VALUE,-3.14159), -3.14159,
				0.000000000001);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testAditionDoubleInfinityPlus1() {
		assertEquals(testee.summe(Double.POSITIVE_INFINITY, 1), 0,
				0.000000000001);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testAditionDoubleNegInfinityPlusNeg1() {
		assertEquals( testee.summe(-1,Double.NEGATIVE_INFINITY), 0,
				0.000000000001);
	}

}
