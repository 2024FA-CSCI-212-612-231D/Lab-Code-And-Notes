package labsolutions.lab12;

public class Main {
    public static void main(String[] args) {
    	
        // Create the first standard deck
        Deck deck1 = new Deck();
        System.out.println("First deck created: " + deck1);
        
        // Shuffle the first deck
        deck1.shuffle();
        System.out.println("First deck shuffled: " + deck1);

        // Draw 5 cards from the first deck and display them
        System.out.println("Drawing 5 cards from the first deck:");
        for (int i = 0; i < 5; i++) {
            Card drawnCard = deck1.drawCard();
            System.out.println("Card drawn: " + drawnCard);
        }

        // Display the deck size using toString
        System.out.println("First deck after drawing 5 cards: " + deck1);

        // Create the second standard deck
        Deck deck2 = new Deck();
        System.out.println("Second deck created: " + deck2);

        // Shuffle the second deck into the first deck
        System.out.println("Shuffling the second deck into the first deck...");
        deck1.shuffleIn(deck2);
        
        // Display the combined deck size using toString
        System.out.println("Combined deck after shuffling in the second deck: " + deck1);
        
        // Draw 5 more cards from the combined deck
        System.out.println("Drawing 5 more cards from the combined deck:");
        for (int i = 0; i < 5; i++) {
            Card drawnCard = deck1.drawCard();
            System.out.println("Card drawn: " + drawnCard);
        }

        // Display the remaining deck size using toString
        System.out.println("Combined deck after drawing 5 more cards: " + deck1);
    }
}

/*
 * Expected output:
	First deck created: Deck containing 52 cards
	First deck shuffled: Deck containing 52 cards
	Drawing 5 cards from the first deck:
	Card drawn: 8 of Hearts
	Card drawn: 4 of Spades
	Card drawn: 10 of Clubs
	Card drawn: Ace of Diamonds
	Card drawn: 3 of Hearts
	First deck after drawing 5 cards: Deck containing 47 cards
	Second deck created: Deck containing 52 cards
	Shuffling the second deck into the first deck...
	Combined deck after shuffling in the second deck: Deck containing 99 cards
	Drawing 5 more cards from the combined deck:
	Card drawn: King of Spades
	Card drawn: 9 of Diamonds
	Card drawn: Queen of Hearts
	Card drawn: 5 of Clubs
	Card drawn: 2 of Diamonds
	Combined deck after drawing 5 more cards: Deck containing 94 cards
*/
