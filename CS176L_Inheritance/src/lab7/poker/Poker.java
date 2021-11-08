package lab7.poker;

import java.util.ArrayList;

/**
 * Your name: Tyler Gennaro
 *
 * Poker.java: Contains a deck of PlayingCards and methods to play basic poker
 *
 */

public class Poker extends CardGame
{
   
	// Constructor(s):	
	public Poker()
	{
      super(true);
	} // end constructor



	// Methods:
	
	
	// Methods to detect hand ranks:
	
	/*
	 * Return the number of pairs:
	 * 0 = no pairs, 1 = one pair, 2 = two pairs
	 */
	public int getPairs(PlayingCard [] hand)
	{
		int pairs = 0;
		ArrayList<Integer> used = new ArrayList<Integer>();
		for (int i=0;i<hand.length;i++) {
			if (!used.contains(hand[i].getValue())) {
				for (int j=0;j<hand.length;j++) {
					if (hand[j] != hand[i] && hand[j].getValue() == hand[i].getValue()) {
						pairs++;
						used.add(hand[i].getValue());
						break;
					}
				}
			}
		}
      return pairs;		
	} // end getPair()
	
	
	
	/**
	 * Detect Three of a kind.  
	 */
	public boolean hasThreeOfAKind(PlayingCard [] hand)
	{    	
		for (int i=0;i<hand.length;i++) {
			boolean hasOne = false;
			for (int j=0;j<hand.length;j++) {
				if (hand[i] != hand[j] && hand[i].getValue() == hand[j].getValue()) {
					if (!hasOne) {
						hasOne = true;
					} else {
						return true;
					}
				}
			}
		}
		return false;	
	} // end hasThreeOfAKind
	
	
	
	
	/**
	 * Detect Full House
	 */
	public boolean hasFullHouse(PlayingCard [] hand)
	{
		return false; // dummy val		
	} // end hasFullHouse

	

	
	/**
	 * Detect Four of a Kind.
	 */
	public boolean hasFourOfAKind(PlayingCard [] hand)
	{    	
		
      return false; // dummy val		
	} // end hasFourOfAKind	
	
	
	
	/**
	 * Detect Flush.
	 */
	public boolean hasFlush(PlayingCard [] hand)
	{    		
			
      return false; // dummy val		
	} // end hasFlush
	
	
	
	
	/**
	 * Detect a Straight (INCOMPLETE)
	 */
	public boolean hasStraight(PlayingCard [] hand)
	{
				
      return false; // dummy val		
	} // end hasStraight
		
	
	
	/**
	 * Detect a Straight Flush
	 */
	public boolean hasStraightFlush(PlayingCard [] hand)
	{
				
      return false; // dummy val		
	} // end hasStraightFlush
	
	
	
	/**
	 * Detect a Royal Flush
	 */
	public boolean hasRoyalFlush(PlayingCard [] hand)
	{
		
		return false; // dummy val		
	} // end hasRoyalFlush
	
	
} // end class