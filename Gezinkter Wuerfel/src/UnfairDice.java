
public class UnfairDice implements IDice {

	private int result;
	
	@Override
	public int getNumber() {
		// return the unfair result
		return result;
	}

	@Override
	public void roll() {
		// everytime dice is rolled, result will be 6
		result = 6;
	}

}
