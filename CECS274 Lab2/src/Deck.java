import java.util.Random;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Deck 
	{
		// Declare and initialize value for a temporary basic involving shuffling
		int b = 0;
	
		// Declare Card Array of deckOfCards
		private Card[] deckOfCards;
		
		// Declare and initialize a Card Array of temporary
		private Card[] temporary = new Card[52];
		
		// Constructor
		public Deck()
		{
			// Indicate deckOfCards to 52 space in memory
			deckOfCards = new Card[52];
			
			// Declare string "suit" and "fValue"
			String suit="";
			String fValue;
			
			// A counter for cards
			int counter = 0;

			// Set up for loop to determine suits 
			for(int index = 1; index <= 4; ++index)
			{
				if(index == 1)
				{
					suit="Spade";
				}

				if(index == 2)
				{	
					suit="Hearts";
				}
				
				if(index == 3)
				{
					suit="Diamonds";
				}
				
				if(index == 4)
				{
					suit="Clubs";
				}
				
				// Set up for loop to determine face value
				for(int j = 1;j <= 13; j++)
				{

					switch (j) 
					{
						case 1:				
							fValue = "A";
							break;

						case 2:
							fValue = "2";
							break;

						case 3:
							fValue = "3";
							break;

						case 4:
							fValue = "4";	
							break;

						case 5:
							fValue = "5";
							break;

						case 6:
							fValue = "6";
							break;

						case 7:
							fValue = "7";
							break;

						case 8:
							fValue = "8";
							break;

						case 9:
							fValue = "9";
							break;

						case 10:
							fValue = "10";	
							break;

						case 11:
							fValue = "J";
							break;

						case 12:
							fValue = "Q";
							break;

						case 13:
							fValue = "K";
							break;

						default:
							fValue = "Invalid Value";
							break;

					}
					
					// Deck of Cards
					deckOfCards[counter++] = new Card(fValue,suit);

				}

			}

} // end of class "Deck"

public void display()
{
		// Declare and initialize a value to determine a new line of every 13 cards
		int c = 0;
		
	
		// If statement to print out "Shuffled Cards"
		if (b == 1)
		{
			
			// State the cards are shuffled
			System.out.println("Shuffled Cards:");
			// Create a random number generator variable
			Random RNG = new Random();
			
			// Use LinkedHashSet to maintain insertion order in creating cards.
			LinkedHashSet<Integer> linkedhashSet = new LinkedHashSet<Integer>();
			while(linkedhashSet.size() < 53)
			{
				// Declare and Initialize a random integer to use for adding the linkedhashSet
				int randomInt = RNG.nextInt(53);
				linkedhashSet.add(randomInt);
			}

			int j=0;
			int z=0;
			
			// Use LinkedHashSet to print out your cards in order to maintain insertion order
			for(Integer i : linkedhashSet) 
			{

				if(i>=52)
				{
					continue;
				}
				// Assign temporary array of Cards in order to mix up the original cards and main the unshuffled deck whenever you need it
				temporary[j]=deckOfCards[i];
				
				// Print out shuffled cards while removing duplicates when using LinkedHashSet
				System.out.print(temporary[j].turnIntoString(temporary[j]) + " ");
				
				// Increment z to count the amount of cards and to see if you need a new line or not
				z++;
				
				// If z is equal to 13, start a new line
				if (z == 13)
				{
					System.out.println();
				}
				
				// If z is equal to 26, start a new line
				if (z == 26)
				{
					System.out.println();
				}

				// If z is equal to 39, start a new line
				if (z == 39)
				{
					System.out.println();
				}

				j++;

			}

		System.out.println();
		
		
		}
		
		else
		{
			// State the cards are unshuffled
			System.out.println("Unshuffled Cards:");
			
			// Use a for loop to print out unshuffled deck
			for(int i=0;i<52;i++)
			{
				// Print out unshuffled deck 
				System.out.print(deckOfCards[i].turnIntoString(deckOfCards[i])+" ");
				
				// Increment c to count the cards and to see if you need a new line or not
				++c;
		
				// If c is equal to 13, start a new line
				if (c == 13)
				{
					System.out.println();
				}
		
				// If c is equal to 26, start a new line
				if (c == 26)
				{
					System.out.println();
				}
		
				// If c is equal to 39, start a new line
				if (c == 39)
				{
					System.out.println();
				}
			
			}
		
		}
}

// Function Shuffle()
public void shuffle() 
{
	
	
	b = 1;
	// Create a random number generator variable
	Random randomNumGenerator = new Random();
	
	// Use LinkedHashSet to maintain insertion order in creating cards.
	LinkedHashSet<Integer> linkedhashSet = new LinkedHashSet<>();
	while(linkedhashSet.size() < 53)
	{
		// Declare and Initialize a random integer to use for adding the linkedhashSet
		int randomInt = randomNumGenerator.nextInt(53);
		linkedhashSet.add(randomInt);

	}

	int j=0;
	int z=0;

	// Use LinkedHashSet to assign your cards in order to maintain insertion order
	for(Integer i : linkedhashSet) 
	{

		if(i >= 52)
		{
			continue;
		}
		
		// Assign temporary array of Cards in order to mix up the original cards and main the unshuffled deck whenever you need it
		temporary[j] = deckOfCards[i];
		
		j++;


	}

	System.out.println();

}

public void playSolitairePrime() 
{
	// State that you are playing Solitaire Prime
	System.out.println("Playing Solitaire Prime!!! ");
	
	// Declaration and Initialization of Variables 
	int count = 0; int fValue = 0; int sum = 0;
	boolean isWinner = false;
	
	// HashSet object Card
	for(Card card : temporary) 
	{
		 //statements that may cause an exception
		try 
		{
			// Reads a string and converts and returns into integer
			fValue = Integer.parseInt(card.getfValue());
		
		// error handling code
		}catch(Exception e) 
		{
		
		// Determine the face value for "A"
		if(card.getfValue().equals("A"))
		{
			// Ace Card
			fValue = 1;
		}
			
		// Determine the face value of "J, Q, K"
		else
		{
			// Jack, Queen, King Card
			fValue = 10;
		}
	}
		// Add the cards together
		sum = sum + fValue;

		// Check if the sum of the cards is a prime or not
		if(isPrime(sum)) 
		{
			// Print out the card to display the output
			System.out.print(card.turnIntoString(card)+", ");
			
			// Print out the Prime if it is a prime
			System.out.println("Prime : "+sum);

			// Restart the process of finding another pile
			sum = 0;
			
			// Continue to count the cards until 52 times to determine if you are a winner
			count++;
			isWinner = true;

		}

		else
		{
			// Print out the card to display the output
			System.out.print(card.turnIntoString(card)+", ");
			
			// End the game if a prime is not determined
			isWinner = false;
		}

	}

	// If true, display that they are a winner and they won in a number of piles
	if(isWinner) 
	{
		System.out.println("");
		System.out.println("Winner in " + count + " Piles !!!\n");
	}

	// If false, display that they are loser 
	else
	{
		System.out.print("Loser\n");
	}
	

}

// Function isPrime() to determine if the sum of a number is a prime or not
boolean isPrime(int x) 
{

	if (x == 1)
	{
		return false;
	}
	
	// Check if x is a multiple of 2
	if (x%2==0) 
	{
		return false;
	}
	
	// If it is not, check the odds
	for(int i=3; i * i <= x; i+=2) 
	{
		if(x % i == 0)
		{
			return false;
		}
	}

	return true;

	}

}

