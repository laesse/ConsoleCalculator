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
 * @version 21 Dec 2018
 * @title TestPotenz
 * 
 */
public class TestPotenz {
	Calculator testee;

	@Before
	public void setUp() throws Exception {
		testee = new Calculator();
	}

	/*
	 * Funktion Testen
	 */

	@Test
	public void test10pow3() {
		assertEquals(testee.potenz(10, 3), 1000,0.0000001);
	}

	@Test
	public void test1pow0() {
		assertEquals(testee.potenz(1, 0), 1,0.000001);
	}

	@Test
	public void test10powN2() {
		assertEquals(testee.potenz(10, -2), 0.01,0.0000001);
	}

	@Test
	public void testForDobuleMaxValue() {
		// in der beschreibung von Dobule.MAX_VALUE steht das das so ist steht das.
		assertEquals(testee.produkt(testee.differenz(2,testee.potenz(2, -52)),testee.potenz(2,1023)), Double.MAX_VALUE,0.0000001);
	}

	@Test
	public void test0pow2() {
		assertEquals(testee.potenz(0, 2), 0,0.000001);
	}

	@Test
	public void test7powNeg4() {
		assertEquals(testee.potenz(30, 2), 900,0.0001);
	}

	@Test
	public void testNeg6powNeg3() {
		assertEquals(testee.potenz(-6, -3), -0.004629629629629629629629629629,0.000000000000001);
	}

	@Test
	public void testMAX_VALUEpow2() {
		assertEquals(testee.potenz(Integer.MAX_VALUE, 2), (double)Integer.MAX_VALUE * (double)Integer.MAX_VALUE,0.00001);
	}

}
