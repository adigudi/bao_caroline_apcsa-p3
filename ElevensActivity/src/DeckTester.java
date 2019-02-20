/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		Deck Deck1 = new Deck(new String[] {"jack", "queen", "king"}, new String[] {"blue", "red"}, new int[] {11, 12, 13});
		System.out.println(Deck1);
		Deck1.deal();
		System.out.println(Deck1);
		Deck1.shuffle();
		System.out.println(Deck1);

		
		Deck Deck2 = new Deck(new String[] {"ace", "two", "three"}, new String[] {"spades", "hearts", "clubs"}, new int[] {1, 2, 3});
		System.out.println(Deck2);
		Deck2.deal();
		System.out.println(Deck2);
		Deck2.shuffle();
		System.out.println(Deck2);
		
		Deck Deck3 = new Deck(new String[] {"Ace", "Two", "Three", "Four"}, new String[] {"Hearts", "Red", "Orange"}, new int[] {1, 2, 3, 4});
		System.out.println(Deck3);
		Deck3.deal();
		System.out.println(Deck3);
		Deck3.shuffle();
		System.out.println(Deck3);

	}
}
