package War;

public class Player {

		private String name;
		private Hand hand = new Hand();
		private int score = 0;
		
		
		public Player(String name) {
			this.name = name;
	}
		@Override
		public String toString() {
			return "Player [name = " + name + "]";
		}
		

	public void draw(Deck deck) {
		hand.add(deck.remove(0));
		
	}
	public Hand getHand() {
		return hand;
	}
	public Card flip() {
		return hand.remove(0);
	}
	public void incrementalScore() {
		score += 1;
		
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}

}
