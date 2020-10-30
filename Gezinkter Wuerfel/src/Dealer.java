
public class Dealer {

	private IDice dice;
	private int score;
	
	public void setDice(IDice dice) {
		score = 0;
		this.dice = dice;
	}
	
	public int getScore() {
		return score;
	}
	
	public void rollDice() {
		dice.roll();
		int result = dice.getNumber();
		if (result == 1 || result == 2) {
			score += result;
		} else if (result == 3 || result == 4) {
			score += result * 2;
		} else if (result == 5) {
			score += 3 * result;
		} else if (result == 6) {
			score += 6 * result;
		} else {
			System.out.println("Etwas ist falsch gelaufen.");
		}
	}
	
}
