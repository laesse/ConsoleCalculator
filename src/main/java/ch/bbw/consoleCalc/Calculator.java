package ch.bbw.consoleCalc;

import java.lang.ArithmeticException;

public class Calculator {

	/**
	 * @throws java.lang.Exception
	 */
	public int summe(int summand1, int summand2) throws java.lang.ArithmeticException {
		long x1 = summand1, x2 = summand2;
		if ((x1 + x2) > (long) Integer.MAX_VALUE) {
			throw new ArithmeticException("sum > Integer.MAX_VALUE");
		} else if ((x1 + x2) < (long) Integer.MIN_VALUE) {
			throw new ArithmeticException("sum < Integer.MIN_VALUE");
		}else {
			return Integer.sum(summand1, summand2);
		}
//		return summand1 + summand2;
	}
	

	public double summe(double summand1, double summand2) {
		if(Double.isInfinite(summand1 + summand2)) {
			System.out.println("hey");
		}
		return summand1 + summand2;
	}

	public int differenz(int minuend, int subtrahend) {
		return minuend - subtrahend;
	}

	public double differenz(double minuend, double subtrahend) {
		return minuend - subtrahend;
	}

	public double quotient(int dividend, int divisor) {
		return quotient((double) dividend, (double) divisor);
		// (double) damit division nicht nur int zurückgibt was ja kein sinn ergibt
	}

	public double quotient(double dividend, double divisor) {
		return dividend / divisor;
	}
	
	private void nixTun() {
		System.out.println("kann nicht getestet werden mit Junit");
	}

}
