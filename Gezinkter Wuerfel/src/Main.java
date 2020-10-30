
public class Main {

	public static void main(String[] args) {
		
		Dealer dealer = new Dealer();
		FairDice fair = new FairDice();
		UnfairDice unfair = new UnfairDice();
		
		dealer.setDice(fair);
		System.out.println("Spieler 1:");
		
		while(dealer.getScore() < 150) {
			dealer.rollDice();
			System.out.println(dealer.getScore());
		}
		
		dealer.setDice(unfair);
		System.out.println("Spieler 2:");
		
		while(dealer.getScore() < 150) {
			dealer.rollDice();
			System.out.println(dealer.getScore());
		}
	}

}
