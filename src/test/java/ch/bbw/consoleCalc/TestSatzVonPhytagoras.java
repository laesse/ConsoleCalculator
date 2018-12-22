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
public class TestSatzVonPhytagoras {
	Calculator testee;

	@Before
	public void setUp() throws Exception {
		testee = new Calculator();
	}
	/*
	 * Keine Ininity tests weil diese schon in bei den Testcases zu potenz() / wurzel() abgehandelt worden sind
	 */

	@Test
	public void test34n() {
		assertEquals(testee.satzVonPytagoras(3., 4., null), 5, 0.000000001);
	}

	@Test
	public void testn45() {
		assertEquals(testee.satzVonPytagoras(null, 4., 5.), 3, 0.000000001);
	}

	@Test
	public void test3n5() {
		assertEquals(testee.satzVonPytagoras(3., null, 5.), 4, 0.000000001);
	}

	@Test
	public void testn35() {
		assertEquals(testee.satzVonPytagoras(null, 3., 5.), 4, 0.000000001);
	}

	@Test
	public void test4n5() {
		assertEquals(testee.satzVonPytagoras(4., null, 5.), 3, 0.000000001);
	}

	@Test
	public void test43n() {
		assertEquals(testee.satzVonPytagoras(4., 3., null), 5, 0.000000001);
	}

	@Test
	public void test1() {
		assertEquals(testee.satzVonPytagoras(1554.1335, 1686.3516, null), 2293.27552959622, 0.000000001);
	}

	@Test
	public void test2() {
		assertEquals(testee.satzVonPytagoras(null, 15.5, 18.5), 10.0995049383621, 0.000000001);
	}

	@Test
	public void test3() {
		assertEquals(testee.satzVonPytagoras(17.89, null, 38.78), 34.4069222686366, 0.000000001);
	}

	@Test
	public void test4() {
		assertEquals(testee.satzVonPytagoras(null, 13.315, 13.315), 0, 0.000000001);
	}

	@Test(expected = ArithmeticException.class)
	public void test5() {
		assertEquals(testee.satzVonPytagoras(null, 15.56, 15.5599999999999), 0, 0.000000001);
	}

	@Test(expected = ArithmeticException.class)
	public void test6() {
		assertEquals(testee.satzVonPytagoras(1.5, null, 1.), 0, 0.000000001);
	}

	@Test(expected = ArithmeticException.class)
	public void test7() {
		assertEquals(testee.satzVonPytagoras(-1.2, 1.2, null), 1.69705627484771, 0.000000001);
	}

	@Test(expected = ArithmeticException.class)
	public void test8() {
		assertEquals(testee.satzVonPytagoras(5.6, -4.1, null), 6.94046107978425, 0.000000001);
	}

	@Test(expected = ArithmeticException.class)
	public void test9() {
		assertEquals(testee.satzVonPytagoras(4., null, -4.), 0, 0.000000001);
	}

	@Test(expected = ArithmeticException.class)
	public void test10() {
		assertEquals(testee.satzVonPytagoras(1., null, null), 0, 0.000000001);
	}

	@Test(expected = ArithmeticException.class)
	public void test11() {
		assertEquals(testee.satzVonPytagoras(null, 1., null), 0, 0.000000001);
	}

	@Test(expected = ArithmeticException.class)
	public void test12() {
		assertEquals(testee.satzVonPytagoras(null, null, 1.), 1, 0.000000001);
	}

	@Test(expected = ArithmeticException.class)
	public void test13() {
		assertEquals(testee.satzVonPytagoras(null, null, null), 0, 0.000000001);
	}

	@Test(expected = ArithmeticException.class)
	public void test14() {
		assertEquals(testee.satzVonPytagoras(1., 1., 1.), 0, 0.000000001);
	}

	@Test(expected = ArithmeticException.class)
	public void test15() {
		assertEquals(testee.satzVonPytagoras(0., null, 1.55), 1.55, 0.000000001);
	}

	@Test(expected = ArithmeticException.class)
	public void test16() {
		assertEquals(testee.satzVonPytagoras(null, 0., 1.5), 1.5, 0.000000001);
	}

	@Test(expected = ArithmeticException.class)
	public void test17() {
		assertEquals(testee.satzVonPytagoras(1.45, null, 0.), 0, 0.000000001);
	}

	@Test(expected = ArithmeticException.class)
	public void test18() {
		assertEquals(testee.satzVonPytagoras(0., 1.4, null), 1.4, 0.000000001);
	}

}
