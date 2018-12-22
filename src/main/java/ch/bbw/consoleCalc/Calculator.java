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
	}

	public double summe(double summand1, double summand2) {
		if (Double.isFinite(summand1 + summand2))
			return summand1 + summand2;
		else
			throw new ArithmeticException("summe is infinite");
	}

	public int differenz(int minuend, int subtrahend) throws ArithmeticException {
		if (subtrahend == Integer.MIN_VALUE) // weil es f�r MIN_VALUE (-2147483648) keine positive int-zahl gibt
												// (MAX_VALUE = 2147483647) sonst die Rechnung aber immer aufgeht...
			throw new ArithmeticException("subtrahend is equals MIN_VALUE");
		else
			return summe(minuend, -1 * subtrahend); // dort ist die ganze max < summe > min sache schon gemacht...
	}

	public double differenz(double minuend, double subtrahend) throws ArithmeticException {
		if (Double.isFinite(minuend - subtrahend))
			return minuend - subtrahend;
		else
			throw new ArithmeticException("differenz is infinite");
	}

	public double quotient(int dividend, int divisor) throws ArithmeticException {
		return quotient((double) dividend, (double) divisor);
		// (double) damit division nicht nur int zur�ckgibt was ja kein sinn ergiebt
	}

	public double quotient(double dividend, double divisor) throws ArithmeticException {
		if (divisor != 0.)
			return dividend / divisor;
		else
			throw new ArithmeticException("division by 0");
	}

	public int produkt(int faktor1, int faktor2) {
		long x1 = faktor1, x2 = faktor2;
		if ((x1 * x2) > (long) Integer.MAX_VALUE) {
			throw new ArithmeticException("produkt > Integer.MAX_VALUE");
		} else if ((x1 * x2) < (long) Integer.MIN_VALUE) {
			throw new ArithmeticException("produkt < Integer.MIN_VALUE");
		} else {
			return faktor1 * faktor2;
		}
	}

	public double produkt(double faktor1, double faktor2) {
		return faktor1 * faktor2;
	}

	public double potenz(double basis, double exponent) {
		return Math.pow(basis, exponent);
	}

	// packetsichtbar && von erbenden klassen sichtbar
	protected double potenz(int basis, int exponent) {
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
	double wurzel(int radikant, int wurzelexponent) throws ArithmeticException {
		return wurzel((double) radikant, (double) wurzelexponent);
	}

	public double quadratwurzel(double radikant) throws ArithmeticException {
		return wurzel(radikant, 2.); // weil dort exeptions schon geworfen werden
	}

	public Double satzVonPytagoras(Double a, Double b, Double c) {
		if (c == null && a != null && b != null) {
			c = quadratwurzel(potenz(a, 2) + potenz(b, 2));
			return c;
		} else if (c != null && a == null && b != null) {
			a = quadratwurzel(potenz(c, 2) - potenz(b, 2));
			return a;
		} else if (c != null && a != null && b == null) {
			b = quadratwurzel(potenz(c, 2) - potenz(a, 2));
			return b;
		} else {
			return null;
		}
	}

	@SuppressWarnings("unused")
	private void nixTun() {
		/*
		 * kann nicht ohne gr�sseren Aufwand getestet werden mit Junit. man k�nnte einen
		 * PrivilegedAccessor oder eine Dp4j to inject reflection brauchen wenn man
		 * eines Tages das Bed�rfnis versp�ren sollte diese Methode zu testen
		 */
	}

}
