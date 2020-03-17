public class Card 
{
	// Declaring a string 
	private String fValue;
	private String suit;
	
	// Constructor
	public Card(String fValue, String suit) 
	{
		// Setting parameters of same name to private class variables
		this.fValue = fValue;
		this.suit = suit;
	}
	
	// Turn letters into single character values
	public String turnIntoString(Card card)
	{
		// Initialize fValue getfValue() string function and suit to getSuit() string function
		String fValue = card.getfValue();
		String suit = card.getSuit();
		
		// If spade, turn "Spade" into "S"
		if(suit.equals("Spade"))
		{
			suit = "S";	
		}
		
		// If Hearts, turn "Hearts" into "H"
		if(suit.equals("Hearts"))
		{
		suit = "H";
		}
		
		// If Diamonds, turn "Diamonds" into "D"
		if(suit.equals("Diamonds"))
		{
		suit = "D";
		}
		
		// If Clubs, turn "Clubs" into "C"
		if(suit.equals("Clubs"))
		{
		suit = "C";
		}
		
		// Returning card and suit
		return fValue + suit;

	}
	
	// Function getSuit() returns type String suit
	public String getSuit() 
	{
		return suit;
	}
	
	// Function getfValue() returns type String fValue
	public String getfValue() 
	{
		return fValue;
	}
	
} // end of class "Card"
