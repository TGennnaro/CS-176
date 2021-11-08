package lab7.poker;

public class PlayPoker {

	public static void main(String[] args) {
		final int POKER_HAND = 5;
		Poker poker = new Poker();
		PlayingCard[] deck = new PlayingCard[POKER_HAND];
		for (int i=0;i<POKER_HAND;i++) {
			deck[i] = poker.draw();
		}
		
		System.out.print("Deck: ");
		for (int i=0;i<deck.length;i++) {
			System.out.print(deck[i].toString()+(i+1==deck.length ? "" : ", "));
		}
		
		System.out.println();
		int pairs = poker.getPairs(deck);
		if (poker.hasThreeOfAKind(deck)) {
			System.out.println("Your deck has three of a kind!");
		} else if (pairs > 0) {
			System.out.println("Your deck has "+pairs+" pair"+(pairs > 1 ? "s" : "")+"!");
		} else {
			System.out.println("Your deck has no pairs.");
		}
	}

}
