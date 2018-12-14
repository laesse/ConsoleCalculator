/**
 * 
 */
package ch.bbw.vola.consoleCalc;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import ch.bbw.consoleCalc.Calculator;

/**
 * @author Lars Volkheimer
 * @version 7 Dec 2018
 * @title TestDivision
 * 
 */
public class TestDivision {
	Calculator testee;
	
	@Before
	public void setUp() throws Exception {
		testee = new Calculator();
	}
	@Test
	public void testDivisionByZero() {
		assertTrue(testee.quotient(23, 0) == Double.POSITIVE_INFINITY);
	}

	@Test
	public void testNegativDivisionByZero() {
		assertTrue(testee.quotient(-Integer.MAX_VALUE, 0) == Double.NEGATIVE_INFINITY);
	}
	
	@Test
	public void test4DividedBy1() {
		assertTrue(testee.quotient(4,1) == 4.0);
	}
	@Test
	public void test4DividedBy2() {
		assertTrue(testee.quotient(4,2) == 2.0);
	}
	@Test
	public void test4DividedByKehrwert2() {
		assertTrue(testee.quotient(4.0,0.5) == 8.0);
	}
	@Test
	public void testPIDividedByPI() {
		assertTrue(testee.quotient(Math.PI,Math.PI) == 1.0);
	}
	@Test
	public void testIvinityDividedByNegativInfinity() {
		// Test mit equals weil quotient(Double.POSITIVE_INFINITY,Double.NEGATIVE_INFINITY) eine klasse als resultat liefert
		assertTrue(new Double(testee.quotient(Double.POSITIVE_INFINITY,Double.NEGATIVE_INFINITY)).equals(Double.NaN));
		
	}
	@Test
	public void testMINDividedByMAX() {
		assertTrue(testee.quotient(Double.MIN_VALUE,Double.MAX_VALUE) == 0.0);
		
	}
}
