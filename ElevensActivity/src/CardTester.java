/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card Card1 = new Card("King", "Hearts", 13);
		System.out.println(Card1);
		Card Card2 = new Card("Ace", "Spades", 1);
		System.out.println(Card2);
		Card Card3 = new Card("Seven", "Clubs", 7);
		System.out.println(Card3);
	}
}
