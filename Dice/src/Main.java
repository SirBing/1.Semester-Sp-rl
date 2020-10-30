
public class Main {

	public static void main(String[] args) {
		Dice dice = new Dice();
		dice.roll();
		int result = dice.getNumber();

		if (result >= 1 && result <= 3) {
			System.out.println(result + " :lower half");
		} else {
			System.out.println(result + " :higher half");
		}
	}

}
