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

	@Test
	public void testDifferenz121N() {
		assertTrue("Test: differenz(1,2) == -1 failed", testee.differenz(1, 2) == -1);
	}

	@Test
	public void testDifferenz211() {
		assertTrue("Test: differenz(2,1) == 1 failed", testee.differenz(2, 1) == 1);
	}

	@Test
	public void testDifferenz12N3() {
		assertTrue("Test: differenz(1,-2) == 3 failed", testee.differenz(1, -2) == 3);
	}

	@Test
	public void testDifferenz1N2N1() {
		assertTrue("Test: differenz(-1,-2) == 1 failed", testee.differenz(-1, -2) == 1);
	}

	@Test
	public void testDifferenzDoubleComplicated() {
		assertEquals("Test: differenz(5.214, 3.654) == 1.56 failed", testee.differenz(5.214, 3.654), 1.56,
				0.0000000001);
	}

	@Test
	public void testDifferenzDoubleSimple() {
		assertTrue("Test: differenz(1.58, 8.35789) == -6.77769 failed", testee.differenz(1.5, 8.5) == -7.0);
	}

	@Test
	public void testDifferenzMaxValue2() {
		assertTrue("Test: differenz(Integer.MAX_VALUE,Integer.MAX_VALUE)== 0 failed",
				testee.differenz(Integer.MAX_VALUE, Integer.MAX_VALUE) == 0);
	}

	@Test
	public void testDifferenzMaxValueMinValue() {
		assertTrue("Test: summe(Integer.MAX_VALUE,Integer.MIN_VALUE)==-1 failed",
				testee.differenz(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
	}
	

}
