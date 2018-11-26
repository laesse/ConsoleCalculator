package ch.bbw.vola.consoleCalc;

import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;

import ch.bbw.consoleCalc.Calculator;

public class CalculatorTest {
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
	public void testAditionDoubleSimple() {
		assertTrue("Test: summe(1.1294,2.344) == 3.4734 failed", testee.summe(1.1294, 2.344) == 3.4734);
	}

	@Test
	public void testAditionDoubleComplicated() {
		assertEquals("Test: summe(2.141, 1.1278) ==  3.2688 failed", testee.summe(2.141, 1.1278), 3.2688,
				0.000000000001);
	}

	@Test
	public void testAditionMaxValue2() {
		assertTrue("Test: summe(Integer.MAX_VALUE,Integer.MAX_VALUE)==Integer.MAX_VALUE * 2 failed",
				testee.summe(Integer.MAX_VALUE, Integer.MAX_VALUE) == Integer.MAX_VALUE * 2);
	}

	@Test
	public void testAditionMaxValueMinValue() {
		assertTrue("Test: summe(Integer.MAX_VALUE,Integer.MIN_VALUE)==-1 failed",
				testee.summe(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
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
	public void testDifferenzDoubleSimple() {
		assertTrue("Test: differenz(5.214, 3654) == 1.56 failed", testee.differenz(5.214, 3654) == 1.56);
	}

	@Test
	public void testDifferenzDoubleComplicated() {
		assertEquals("Test: differenz(1.58, 8.35789) == -6.77769 failed", testee.differenz(1.58, 8.35789), -6.77769,
				0.000000000001);
	}

	@Test
	public void testDifferenzMaxValue2() {
		assertTrue("Test: differenz(Integer.MAX_VALUE,Integer.MAX_VALUE)== 0 failed",
				testee.differenz(Integer.MAX_VALUE, Integer.MAX_VALUE) == Integer.MAX_VALUE * 2);
	}

	@Test
	public void testDifferenzMaxValueMinValue() {
		assertTrue("Test: summe(Integer.MAX_VALUE,Integer.MIN_VALUE)==-1 failed",
				testee.differenz(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
	}
	

}
