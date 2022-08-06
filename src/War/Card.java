package War;

public class Card {
	
	private String value;
	private String name;
	private int rank;
	
	public Card(String value, String name, int rank) {
		this.value = value;
		this.name = name;
		this.rank = rank;
	}
	
	protected int getRank() {
		return rank;
	}

	protected String getValue() {
		return value;
	}

	protected void setValue(String value) {
		this.value = value;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Card Value: " + value + "\tCard name: " + name;
	}

}
