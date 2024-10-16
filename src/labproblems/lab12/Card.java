package labproblems.lab12;

public class Card {
	//keyword final means it can't be changed once initialized
	//attempting to change the value in the field will give a syntax error
	private final String suit;
	private final String rank;
	
	public Card(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public String getRank() {
		return rank;
	}
	
	public String toString() {
		return rank + " of " + suit;
	}
	
	public boolean hasSameRankAs(Card otherCard) {
		return rank.equals(otherCard.rank);
	}
	
	// TODO: Write isFlush, a static method which takes 
	// an array of cards (the array can be any size) 
	// and returns true if all of the cards in the 
	// array have the same suit.
	
}