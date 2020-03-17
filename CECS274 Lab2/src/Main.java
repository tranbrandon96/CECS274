// Name: Brandon Tran
// Class: CECS 274-05
// Project Name: Program #2 - Solitaire Prime
// Due Date: October 2, 2018

import java.util.Scanner;

public class Main 
{
	public static void main(String args[])
	{
		// Creating an object myDeck
		Deck myDeck = null;

		// Creating a scanner in
		Scanner in = new Scanner(System.in);
		
		// Declaring and initializing variable for choice
		int choice = 0;

		while(choice != 5) 
		{
			// Menu
			System.out.println();	
			System.out.println("Welcome to Solitaire Prime!");
			System.out.println("1. New Deck");
			System.out.println("2. Display Deck");
			System.out.println("3. Shuffle Deck");
			System.out.println("4. Play Solitaire Prime");
			System.out.println("5. Exit");
			System.out.print("Enter your choice (1-5) :  ");

			// Users input into choice
			choice = in.nextInt();
			System.out.println();


			// Switch statements for users choice
			switch(choice)
			{
				// New Deck
				case 1:
						System.out.println("Creating A New Deck!");
						myDeck = new Deck();
						break;
				
				// Display Deck
				case 2: 
						myDeck.display();
						System.out.println();
					
				// Shuffle Deck
				case 3: 
						myDeck.shuffle();
						break;

				// Play Solitaire Prime
				case 4:
						myDeck.playSolitairePrime();
						break;
				// Exit
				case 5:
					break;
				
				// Invalid Choice if user chooses wrong numbers other than 1-5
				default: 
					System.out.println("Invalid choice, pick another option.");
					break;

			}
			
		}

	}
} // end of "main"
