import java.util.ArrayList;

// Create fields for Player class.
	// name: the player's name
	// chips: the amount of chips player has
	// bet: how much player wants to bet in this round 
	// oneRoundCard: an Array List that stores the player's cards in this round. 
public class Player {
	private String name;
	private int chips;
	private int bet;
	private ArrayList<Card>oneRoundCard;
	
// Create the Player constructor method with parameters name and chips.
	// so when a Player instance is created, 
	// the name and the number of chips of player would be noted.
	public Player(String name, int chips) {
		this.name = name;
		this.chips = chips;
		bet = 0;
		oneRoundCard =new ArrayList<Card>();
		
	}
	
// Create method getName().
	// this method is a getter method
	// which returns name of the Player.
	public String getName() {
		return name;
	}
	
// Create method makeBet().
	// this method returns an integer, which is the amount bet. 
	// By default, amount bet for each time is 1 dollar.
	// this means bet = 1.
	// Take note: check if player still has chips.
	// If player doesn't have anymore chips, he can't place bet.
	public int makeBet() {
		if (chips == 0) {
			bet = 0;
			return bet;
		}
		else {
			bet = 1;
			return bet;
		}
	}
	
// Create method setOneRoundCard(ArrayList<Card>cards).
	// this method returns nothing. hence voided.
	// it sets the card for this round.
	public void setOneRoundCard(ArrayList<Card>cards) {
		oneRoundCard = cards;
		
	}
	
// Create method hitMe().
	// this method returns True when player wants another card
	// returns False when player doesn't want another card.
	// this is based on the basic principle in Black Jack Game.
	// below 16: Card is needed as total sum is insufficient.
	// above 17: Card is not needed as total sum is sufficient.
	// make use of oneRoundCard field. 
	public boolean hitMe() {
		int x = 0;
		for (Card c: oneRoundCard) {
			x = x + c.getRank();
		}
		
		if (x <= 16) {
			return true;
		}
		else  {
			return false;
		}
	}
	
// Create method getTotalValue().
	// this method returns the total value of the cards player has.
	public int getTotalValue() {
		int x = 0;
		for (Card c: oneRoundCard) {
			x = x + c.getRank();
		
		}
		return x;
	}
	
// Create method getCurrentChips().
	// this method returns the player's remaining number of chips.
	public int getCurrentChips() {
		return chips;
		
	}
	
// Create method increaseChips(int diff).
	// this method is void return type, it sets the number of chips for the player.
	// it increase the number of Chips for the player when it is called.
	public void increaseChips(int diff) {
		chips = chips + diff;
	}
	
// Create method sayHello().
	// this method is void, Player automatically say hello.
	// player introduce himself, name and number of chips he has.
	public void sayHello() {
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
	}
	
	
	
	
}
