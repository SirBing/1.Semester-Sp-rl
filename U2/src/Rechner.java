import java.util.Scanner;

public class Rechner {

	public static void main(String[] args) {
		new Rechner();
	}

	

	public Rechner() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Operation: ");
		String operation = scanner.nextLine();
		System.out.print("A: ");
		int a = scanner.nextInt();
		System.out.print("B: ");
		int b = scanner.nextInt();
		switch (operation) {
		case "ADD":
			System.out.println("Addition: " + this.addieren(a, b));
			break;
		case "SUB":
			System.out.println("Subtrahieren: " + this.subtrahieren(a, b));
			break;
		case "MUL":
			System.out.println("Multiplizieren: " + this.multiplizieren(a, b));
			break;
		case "DIV":
			System.out.println("Dividieren: " + this.dividieren(a, b));
			break;
		default:
			System.err.println("Ungültiger Operator");
			break;
		}
		scanner.close();
	}

	public int addieren(int a, int b) {
		return a + b;
	}

	public int subtrahieren(int a, int b) {
		return a - b;
	}

	public int multiplizieren(int a, int b) {
		return a * b;
	}

	public int dividieren(int a, int b) {
		return a / b;
	}

}
