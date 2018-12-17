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

		
		System.out.println("Calculate: "+value1+" / "+value2+" = "+c.quotient(value1, value2));
		System.out.println("Calculate: "+value3+" / "+value4+" = "+c.quotient(value3, value4));

		
		System.out.println("Calculate: "+value1+" ^ "+value1+" = "+c.potenz(value1, value1));
		System.out.println("Calculate: "+value3+" ^ "+value4+" = "+c.potenz(value3, value4));

		
		System.out.println("Calculate: "+value1+"te wurzel von "+value1+" = "+c.wurzel(value1, value1));
		System.out.println("Calculate: "+value3+"te wurzel von "+value4+" = "+c.wurzel(value3, value4));


		System.out.println("Calculate: Pytagoras a=3, b=4 -> c="+c.satzVonPytagoras(3., 4., null));
		System.out.println("Calculate: Pytagoras a=2112, c=2113 -> b="+c.satzVonPytagoras(2112., null, 2113.));
		System.out.println("Calculate: Pytagoras c=113, b=112 -> a="+c.satzVonPytagoras(null, 112., 113.));
		System.out.println("Calculate: Pytagoras c=16.3, b=8.7 -> a="+c.satzVonPytagoras(null, 8.7, 16.3));
		System.out.println(c.differenz(Double.MIN_VALUE,Double.MIN_VALUE));
		
	}
}
