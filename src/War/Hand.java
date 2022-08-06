package War;

import java.util.LinkedList;
import java.util.List;

public class Hand extends LinkedList<Card> {
	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		
		b.append("List of cards: ").append(System.lineSeparator());
		
		for (Card card : this) {
			b.append(" ").append(card).append(System.lineSeparator());
		}
		
		return b.toString();
	}

}
