package ch.bbw.consoleCalc;

import java.lang.ArithmeticException;

public class Calculator {

	/**
	 * @throws java.lang.Exception
	 */
	public int summe(int summand1, int summand2) throws ArithmeticException {
		long x1 = summand1, x2 = summand2;
		if ((x1 + x2) > (long) Integer.MAX_VALUE) {
			throw new ArithmeticException("sum > Integer.MAX_VALUE");
		} else if ((x1 + x2) < (long) Integer.MIN_VALUE) {
			throw new ArithmeticException("sum < Integer.MIN_VALUE");
		} else {
			return Integer.sum(summand1, summand2);
		}
//		return summand1 + summand2;
	}

	public double summe(double summand1, double summand2) {
		if (Double.isInfinite(summand1 + summand2)) {
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

	// packetsichtbar && von erbenden klassen sichtbar
	protected double potenz(double basis, double exponent) {
		return Math.pow(basis, exponent);
	}

	public double potenz(int basis, int exponent) {
		return potenz((double) basis, (double) exponent);
	}

	public double wurzel(double radikant, double wurzelexponent) throws ArithmeticException {
		if (wurzelexponent <= 1)
			throw new ArithmeticException("wurzelexponent is lower then 1");
		else if (radikant < 0)
			throw new ArithmeticException("radikant is lower then 0");
		else 
			return potenz(radikant, 1. / wurzelexponent);
	}

	// packetsichtbar
	double wurzel(int radikant, int wurzelexponent) {
		return wurzel((double) radikant, (double) wurzelexponent);
	}

	public double quadratwurzel(double radikant) {
		return potenz(radikant, (1. / 2.));
	}

	public Double satzVonPytagoras(Double a, Double b, Double c) {
		if (c == null && a != null && b != null) {
			c = quadratwurzel(potenz(a,2) + potenz(b,2));
			return c;
		} else if (c != null && a == null && b != null) {
			a = quadratwurzel(potenz(c,2) - potenz(b,2));
			return a;
		} else if (c != null && a != null && b == null) {
			b = quadratwurzel(potenz(c,2) - potenz(a,2));
			return b;
		} else {
			return null;
		}
	}

	private void nixTun() {
		// kann nicht getestet werden mit Junit
	}

}
