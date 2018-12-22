
package ch.bbw.consoleCalc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ch.bbw.consoleCalc.Calculator;

/**
 * @author Lars Volkheimer
 * @version 22 Dec 2018
 * @title TestMultiplikationInt
 * 
 */
public class TestPotenzInt {
	Calculator testee;

	@Before
	public void setUp() throws Exception {
		testee = new Calculator();
	}

	/*
	 * int Funktion testen 
	 * dieser test ist hier um die package sichtbaren Variabeln von der Klasse Calculator zu testen
	 */
	@Test
	public void test() {
		/*
		 * Druch diesen Test ist bewiesen das die Variante mit int Parameter der Funktion
		 * funktioniert weil diese funktion die Funktion mit den double Parametern mitgebraucht
		 * kann man sagen das diese version der Funktion ausreichend getestet ist 
		 */
		assertEquals(testee.potenz(10, 3), 1000, 0.0000001);
	}

}
