package ch.bbw.consoleCalc;

public class App {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int value1 = 2;
		int value2 = 1;
		double value3 = 2.141;
		double value4 = 1.1278;
		System.out.println("Console Calculator");
		System.out.println("==================");

		System.out.println("Calculate: "+value1+" + "+value2+" = "+c.summe(value1, value2));
		System.out.println("Calculate: "+value3+" + "+value4+" = "+c.summe(value3, value4));
		

		System.out.println("Calculate: "+value1+" - "+value2+" = "+c.differenz(value1, value2));
		System.out.println("Calculate: "+value3+" - "+value4+" = "+c.differenz(value3, value4));
	}
}
