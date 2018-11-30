package ch.bbw.consoleCalc;

public class Calculator {
	public int summe(int summand1, int summand2) {
		return summand1 + summand2;
	}

	public double summe(double summand1, double summand2) {
		return summand1 + summand2;
	}

	public int differenz(int minuend, int subtrahend) {
		return minuend - subtrahend;
	}

	public double differenz(double minuend, double subtrahend) {
		return minuend - subtrahend;
	}

	public double quotient(int dividend, int divisor) {
		return (double) dividend / (double) divisor;
		// (double) damit division nich nur int zurückgibt was ja kein sinn ergibt
	}

	public double quotient(double dividend, double divisor) {
		return dividend / divisor;
	}
}
