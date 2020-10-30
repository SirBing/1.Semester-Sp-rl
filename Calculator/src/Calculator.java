
public class Calculator {

	public static void main(String[] args) {
		System.out.println(Calculator.addieren(3, 5));
		System.out.println(Calculator.subtrahieren(10, 5));
		System.out.println(Calculator.dividieren(20, 5));
		System.out.println(Calculator.multiplizieren(3, 4));
		
	}

	public static int addieren(int a, int b) {
		return a + b;
	}

	public static int subtrahieren(int a, int b) {
		return a - b;
	}

	public static double dividieren(double a, double b) {
		return a / b;
	}

	public static int multiplizieren(int a, int b) {
		return a * b;
	}

}
