/**
 * 
 */
package ch.bbw.consoleCalc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Lars Volkheimer
 * @version 22 Dec 2018
 * @title TestWurzel
 * 
 */
public class TestWurzel {
	Calculator testee;

	@Before
	public void setUp() throws Exception {
		testee = new Calculator();
	}

	/*
	 * double funktion muss nicht noch 
	 * mehr getestet werden weil sie ja das selbe ist wie die int Funktion
	 */

	@Test
	public void test3tewurzelvon27() {
		assertEquals(testee.wurzel(27, 3), 3, 0.0000001);
	}

	@Test
	public void test2teWurzelVon169() {
		assertEquals(testee.wurzel(169, 2), 13, 0.0000001);
	}
	
	@Test
	public void test2einhalbstewurzelvon4komma315() {
		assertEquals(testee.wurzel(4.315, 2.5), 1.79470188939, 0.0000001);
	}

	@Test(expected=ArithmeticException.class)
	public void testNeg2teWruzelvon2() {
		assertEquals(testee.wurzel(2, -2), 0, 0.0000001);
	}

	@Test(expected=ArithmeticException.class)
	public void test2teWruzelvonNeg2einhalb() {
		assertEquals(testee.wurzel(-2.5, 2), 0, 0.0000001);
	}

	@Test
	public void testMaxValuesteWruzelvonMaxValue() {
		assertEquals(testee.wurzel(Integer.MAX_VALUE,Integer.MAX_VALUE), 1.0000000100059261146933078321692, 0.0000000000000000001);
	}

	@Test
	public void test3teWurzelvonInfinity() {
		assertEquals(testee.wurzel(Double.POSITIVE_INFINITY, 3), Double.POSITIVE_INFINITY, 0.0000001);
	}

	@Test
	public void testInfintyteWurzelvon2() {
		assertEquals(testee.wurzel(2, Double.POSITIVE_INFINITY), 1, 0.0000001);
	}
	
	@Test(expected=ArithmeticException.class)
	public void test0teWurzelvon2() {
		assertEquals(testee.wurzel(2,0), 1, 0.0000001);
	}

	@Test
	public void testhalbeWurzelvon2() {
		assertEquals(testee.wurzel(2, 0.5), 4, 0.0000001);
	}

	@Test
	public void testQuadratWurzelvon2() {
		assertEquals(testee.quadratwurzel(2), 1.41421356, 0.0000001);
	}
	
	@Test
	public void testQuadratWurzelvon225() {
		assertEquals(testee.quadratwurzel(225), 15, 0.0000001);
	}

	@Test
	public void testquadratwurzelVon0Komma5() {
		assertEquals(testee.quadratwurzel(0.5), 0.70710678118, 0.0000001);
	}

}
