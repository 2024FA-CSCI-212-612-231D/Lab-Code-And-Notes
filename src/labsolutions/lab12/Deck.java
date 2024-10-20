package labsolutions.lab12;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<Card>();
	private ArrayList<Card> originalCards = new ArrayList<Card>();
	
	// parameterized constructor responsible for initializing 
	// the Deck object based on the suits and ranks arrays
	public Deck(String[] suits, String[] ranks) {
		for(int i = 0; i < suits.length; i++) {
			for(int j = 0; j < ranks.length; j++) {
				// for each combination of a suit and a rank, 
				// it creates a new Card object using the Card constructor
				Card card = new Card(suits[i], ranks[j]);
				cards.add(card);
				originalCards.add(card); // a backup for restoring the deck to its original state
			}
		}
	}

	// non-parameterized (or default) constructor delegates to the 
	// parameterized constructor by calling it with default values (standard suits and ranks)
	public Deck() {
		this(getStandardSuits(), getStandardRanks()); 
		// the this() call passes these arrays to the parameterized constructor
	}
	
	private static String[] getStandardSuits() {
		String[] suits = {"Hearts",  "Diamonds", "Spades", "Clubs"};
		return suits;
	}
	
	private static String[] getStandardRanks() {
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		return ranks;
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card drawCard() {
		return cards.remove(0);
	}
	
	public int getNumCards() {
		return cards.size();
	}
	
	public void returnCardToTop(Card card) {
		cards.add(0, card);
	}
	
	public void returnCardToBottom(Card card) {
		cards.add(card);
	}
	
	public void restore() {
		cards = new ArrayList<Card>(originalCards); //makes copy to preserve original list
	}
	
	// TODO: Write shuffleIn, an instance method in the Deck class 
	// that takes another Deck called "otherDeck" as a parameter, 
	// adds all cards from otherDeck into this Deck, 
	// shuffles this Deck, 
	// and removes all cards from otherDeck.
	public void shuffleIn(Deck otherDeck) {
		while(otherDeck.getNumCards() != 0) {
			cards.add(otherDeck.drawCard());
		}
		shuffle();
	}
	
	// TODO: write a toString method that returns a string 
	// telling the number of cards in the deck 	
	public String toString() {
		return "Deck containing " + cards.size() + " cards";
	}
	
}
