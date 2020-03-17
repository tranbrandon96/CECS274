// Name: Brandon Tran
// Class: CECS 274-05
// Project Name: Program #4 - Recursions
// Due Date: October 30, 2018

import java.util.Scanner;

public class Main {
	// Recursive function
	public static int counter = 0;
	public static double weight(int row, int column)
	{
		// Increment counter to see how many times a recursive function was called in the output.
		++counter;
		
		// First person has no weight
		if(row == 1 && column == 1)
		{
			return 0;
		}
		
		// First person in the row has:
		// Half the weight of the person on their left shoulder (100)
		// Half the weight that this person has
		else if(column == 1)
		{
			return(100 + weight(row-1, column)/2);
		}
		
		// Same thing for the last person in the row
		else if(column == row)
		{
			return(100 + weight(row-1, column-1)/2);
		}
		
		else
		// Every other person has:
		// Half the weight of people on his shoulders = 100 + 100 = 200
		// Half the weights on these people
		return(200 + weight(row-1, column)/2 + weight(row-1, column-1)/2);
	}
	public static void main(String[] args)
	{
		// Scanner variable
		Scanner in = new Scanner(System.in);
		
		// Variables to store row and column
		int row;
		int column;
		
		// Ask the user what row and column and store it into the variables.
		System.out.println("Welcome to the Human Pyramid.");
		System.out.println("Select a row, column combination and I will tell you how much weight that person is supporting.");
		System.out.println();
		System.out.print("Please type your selections for Row and Column:\n");
		row = in.nextInt();
		column = in.nextInt();
		
		// Create a while loop to repeat the process of asking the user 
		// what row and column and stops when the user inputs 0 for row and 0 for columns.
		while(row != 0 && column != 0)
		{
			System.out.println("Person at (" + row + ", " + column + ") is supporting " + (int)weight(row,column) + " pounds.");
			System.out.println("(The recursive function was called " + counter + " times)");
			System.out.println();
			counter = 0;
			System.out.print("Please type your selections for Row and Column:\n");
			row = in.nextInt();
			column = in.nextInt();
		}
		System.out.println();
		System.out.println("Thanks for playing Human Pyramid. Don't let me down!");
	}
}
