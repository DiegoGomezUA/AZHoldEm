import java.util.Iterator;


public class Player {

	int balance;
	String playerName;
	
	private Card[] hand = new Card[2];
	
	public Player(String name) {
		balance = 100;
		playerName = name;
	}
	
	private void setHand(Card c1, Card c2) {
		hand[0] = c1;
		hand[1] = c2;
	}
	
	private int giveWinnings(int winnings) {
		balance = balance + winnings;
		return balance;
	}
	
	private int takeAnte(int loss) {
		balance = balance - loss;
		return balance;
	}
	
}
