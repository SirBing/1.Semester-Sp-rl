

public class Dice {

	double number;
	
	public void roll () {
		number = Math.random() * 6 + 1;
	}
	
	public int getNumber () {
		return (int)number;
	}

}
