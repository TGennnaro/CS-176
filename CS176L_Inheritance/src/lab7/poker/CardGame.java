package lab7.poker;

/**
 * Your name: Tyler Gennaro
 *
 * CardGame.java: Contains a deck of PlayingCards and basic methods
 *
 */

import java.util.ArrayList;
import java.util.Collections;
// use for shuffling
// https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html

public class CardGame
{
	// instance variables
	ArrayList<PlayingCard> deck;

	// Constructor(s):	
   /**
    * @param optional deck shuffle
    */
	public CardGame(boolean shuffle)
	{
      getNewDeck(shuffle);
	} // end constructor



	// Methods:
	
   /*
    * Get new deck and optionally shuffle it for every new game.
    * @param shuffle
    */
   public void getNewDeck(boolean shuffle)
   {
	   ArrayList<PlayingCard> newDeck = new ArrayList<PlayingCard>();

		int cardNum = 0;
		for (int value = 1; value <= 13; value++)
		{
		   for (int suit = 1; suit <= 4; suit++)
		   {
			    newDeck.add(new PlayingCard(value, suit));
		   }
		}

      deck = newDeck;

      // optional shuffle deck
      if (shuffle) Collections.shuffle(deck);
   }


	/*
	 * Print deck.
	 */
	public void printDeck()
	{
		for (int i = 0; i < deck.size(); i++)
		{
			System.out.println("Card " + i + ": " + deck.get(i));
		}
	} // end printDeck()
	
	
	/*
	 * Get PlayingCard from start of deck
    * @return card
	 */
	public PlayingCard draw()
	{
      PlayingCard card = deck.get(0);
      deck.remove(0);
		return card;
	}



	/*
	 * Get a PlayingCard by index.
    * @return card
	 */
	public PlayingCard draw(int i)
	{
      PlayingCard card = deck.get(i);
      deck.remove(i);
		return card;
	}
	
	
	
} // end class