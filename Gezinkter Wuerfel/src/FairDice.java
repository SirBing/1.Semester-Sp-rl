
public class FairDice implements IDice {

	private int result;
	
	@Override
	public int getNumber() {
		return result;
	}

	@Override
	public void roll() {
		result = (int)(Math.random() * 6 + 1);
	}

}
