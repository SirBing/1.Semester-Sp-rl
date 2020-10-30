package dice2;

public class Dice {
	
	int sides;
	
	public Dice (int sides) {
		this.sides = sides;
		
	}
	
	public String roll () {
		return "Sie haben "+  Math.random() * this.sides + 1 + "Augenzahl gewürfelt.";
	}
}
