package War;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck {
	
	private final List<String> names = List.of("Hearts", "Spades", "Clubs", "Diamonds");
	
	private final List <String> values = List.of("2","3","4", "5", "6", "7", "8","9", "10", "Kings", "Queens", "Jack","Aces");
	
	public Deck() {
		for(int namePos = 0; namePos < names.size(); namePos++) {
			int rank = namePos + 2;
			String name = names.get(namePos);
			
		for(int valuePos = 0; valuePos < values.size(); valuePos++)	{
			int place = valuePos + 2;
			String value = values.get(valuePos);
			
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		
		b.append("List of cards: ").append(System.lineSeparator());
		
		for (Card card : this) {
			b.append(" ").append(card).append(System.lineSeparator());
		}
		
		return b.toString();
	}
	
	public void shuffle() {
		Collections.shuffle((List<?>) this);
	}

	public Card remove(int i) {
		return null;
	}

	public int size() {
		return 0;
	}
	
}
