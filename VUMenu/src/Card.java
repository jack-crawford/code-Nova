import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class Card {
	public static enum Suit{Clubs, Diamonds, Hearts, Spades};
	public static enum Faces{Deuce,Three,Four,Five,Six,Seven,Eight,Nine,Ten,J,Q,K,A};
	private Suit suit;
	private Faces face;
	public Card(Faces cardface, Suit cardsuit) {
		face = cardface;
		suit = cardsuit;
	}
	public Faces getFace() {
		return face;
	}
	public Suit getSuit() {
		return suit;
	}
	public String toString() {
		return suit + "is the suit and the face is " + face;
	}
	public class DeckOfCards {
		private List <Card> list;
		public DeckOfCards() {
			Card [ ] deck = new Card[52];
			int count = 0;
			for(Card.Suit suit : Card.Suit.values()) {
				for(Card.Faces face: Card.Faces.values()) {
					deck[ count ] = new Card(face, suit);
					count++;
				}
			}
		}
	}
}
