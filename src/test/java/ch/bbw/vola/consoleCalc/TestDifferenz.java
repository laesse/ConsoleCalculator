package ch.bbw.vola.consoleCalc;

import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;

import ch.bbw.consoleCalc.Calculator;

public class TestDifferenz {
	Calculator testee;

	@Before
	public void setUp() throws Exception {
		testee = new Calculator();
	}

	/*
	 * Integer Funktion Tests
	 */

	@Test
	public void testDifferenz121N() {
		assertTrue(testee.differenz(1, 2) == -1);
	}

	@Test
	public void testDifferenz211() {
		assertTrue(testee.differenz(2, 1) == 1);
	}

	@Test
	public void testDifferenz12N3() {
		assertTrue(testee.differenz(1, -2) == 3);
	}

	@Test
	public void testDifferenz1N2N1() {
		assertTrue(testee.differenz(-1, -2) == 1);
	}

	@Test
	public void testDifferenzMaxValue2() {
		assertTrue(testee.differenz(Integer.MAX_VALUE, Integer.MAX_VALUE) == 0);
	}

	@Test(expected = ArithmeticException.class)
	public void testDifferenzMaxValueMinValue() {
		assertTrue(testee.differenz(Integer.MAX_VALUE, Integer.MIN_VALUE) == 0);
	}

	/*
	 * Double Funktion Tests
	 */

	@Test
	public void testDifferenzDouble() {
		assertEquals(testee.differenz(5.214, 3.654), 1.56, 0.0000000001);
	}

	@Test
	public void testDifferenzDoublePlusMinus() {
		assertTrue(testee.differenz(1.5, -8.5) == 10.0);
	}

	@Test
	public void testDifferenzDoubleMinusPlus() {
		assertEquals(testee.differenz(-341654102.2, 3416541022.), -3758195124.20, 0.0000000001);
	}

	@Test
	public void testDifferenzDoubleMinusMinus() {
		assertEquals(testee.differenz(-123.456, -123.123),-0.333,0.00000000000001);
	}

	@Test(expected = ArithmeticException.class)
	public void testDifferenzDoubleMaxMinusNegZahl() {
		assertEquals(testee.differenz(Double.MAX_VALUE, -1 * Double.MAX_VALUE), 0, 0.000000000001);
	}

	@Test
	public void testDifferenzDoubleMINMinusMIN() {
		assertEquals(testee.differenz(Double.MIN_VALUE, Double.MIN_VALUE), 0, 0.000000000001);
	}

	@Test(expected = ArithmeticException.class)
	public void testDifferenzDoubleInfinityPlus1() {
		assertEquals(testee.differenz(Double.POSITIVE_INFINITY, 1), 0, 0.000000000001);
	}

	@Test(expected = ArithmeticException.class)
	public void testDifferenzDoubleNegInfinityPlusNeg1() {
		assertEquals(testee.differenz(-1, Double.NEGATIVE_INFINITY), 0, 0.000000000001);
	}

}
