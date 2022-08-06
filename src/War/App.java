package War;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class App {
	
	Random random = new Random();

	public static void main(String[] args) {
		
	}
	private void run() {
		List<String> theNames =new LinkedList<>(theNames);
		Player player1 = createPlayer(theNames);
		Player player2 = createPlayer(theNames);
		
		System.out.println(player1.getName() + " is playing" + player2.getName());
		
		Deck deck = new Deck();
		deck.shuffle();
			
		deal(deck, player1, player2);
		play(player1, player2);
		
		declareWinner(player1, player2);

		}
	
	private void declareWinner(Player player1, Player player2) {
		if (player1.getScore() > player2.getScore()) {
			printWinner(player1);
			printLoser(player2);	
		}else if (player2.getScore() > player1.getScore()) {
			printWinner(player2);
			printLoser(player1);
		}else {
			printTie(player1, player2);
		}
		
	}
	private void printTie(Player player1, Player player2) {
		System.out.println(player1.getScore() + player2.getScore());
		
	}
	private void printLoser(Player loser) {
		System.out.println(loser.getName() + loser.getScore());
		
	}
	private void printWinner(Player winner) {
		System.out.println(winner.getName() + winner.getScore());
		
	}
	private void play(Player player1, Player player2) {
		int numTurns = player1.getHand().size();
		for(int turn = 0; turn < numTurns; turn++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			if (card1.getRank() > card2.getRank()) {
				player1.incrementalScore();
			}else if (card2.getRank() > card1.getRank()) {
				player2.incrementalScore();			
		}
			
	}
		
}
	private void deal(Deck deck, Player player1, Player player2) {
		int size = deck.size();
		for (int index = 0; index < size; index++) {
			if(index % 2 == 0) {
				player1.draw(deck);
			}else {
				player2.draw(deck);
			}
		}
		
	}
	private Player createPlayer(List<String>names) {
		int pos = random.nextInt(names.size());
		String name = names.remove(pos);
		return new Player(name);
	}
		

	

}
