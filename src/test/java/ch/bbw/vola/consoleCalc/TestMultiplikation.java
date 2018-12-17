/**
 * 
 */
package ch.bbw.vola.consoleCalc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ch.bbw.consoleCalc.Calculator;

/**
 * @author Lars Volkheimer
 * @version 7 Dec 2018
 * @title TestMultiplikation
 * 
 */
public class TestMultiplikation {
	Calculator testee;

	@Before
	public void setUp() throws Exception {
		testee = new Calculator();
	}

	/*
	 * Integer Funktion Testen
	 */

	@Test
	public void test5times6() {
		assertEquals(testee.produkt(5, 6), 30);
	}

	@Test
	public void test4times1() {
		assertEquals(testee.produkt(4, 1), 4);
	}

	@Test
	public void test1times45() {
		assertEquals(testee.produkt(1, 45), 45);
	}

	@Test
	public void test88times0() {
		assertEquals(testee.produkt(88, 0), 0);
	}

	@Test
	public void test0times15() {
		assertEquals(testee.produkt(0, 15), 0);
	}

	@Test
	public void test7timesNeg4() {
		assertEquals(testee.produkt(7, -4), -28);
	}

	@Test
	public void testNeg78timesNeg313() {
		assertEquals(testee.produkt(-78, -313), 24414);
	}

	@Test(expected = ArithmeticException.class)
	public void testMAX_VALUEtimes133() {
		assertEquals(testee.produkt(Integer.MAX_VALUE, 133), 0);
	}

	@Test(expected = ArithmeticException.class)
	public void testMIN_VALUEtimes6() {
		assertEquals(testee.produkt(Integer.MIN_VALUE, 6), 0);
	}

	@Test(expected = ArithmeticException.class)
	public void testMIN_VALUEtimesNeg1() {
		assertEquals(testee.produkt(Integer.MIN_VALUE, -1), 0);
	}

	/*
	 * Double Funktion Testen
	 */

}
