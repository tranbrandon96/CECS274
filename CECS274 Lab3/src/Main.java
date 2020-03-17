// Name: Brandon Tran
// Class: CECS 274-05
// Project Name: Program #3 - LinkedList
// Due Date: October 18, 2018

import java.util.Scanner;
import java.util.Random;

// Main class
public class Main 
{
	public static void main(String[] args) 
	{
		// Create a scanner variable
		Scanner in = new Scanner(System.in);
		
		// Create a integer variable to find number
		int number;
		
		// Create an object myList of LinkedList
		LinkedList myList=new LinkedList();
		
		// Create a random variable
		Random ran = new Random();     
		
		// Create a for loop to insert 200 numbers into myList
		for (int index = 0; index < 200; index++)
	    {
		    // Create a random number ranging from 10000 - 99999
			int RNG = ran.nextInt((99999 - 10000) + 1) + 10000;
	        
			// Add random integers into myList 
			myList.add(RNG);
	    }
	    
		// Display myList
	    myList.display();
	    
	    // Create a while loop for menu option
		while(true)
		{
		    // Print menu option including size and average
			System.out.println("(R)emove\t(N)ew\t(F)ind\tSize: " + myList.size + "\tAverage: "+myList.sum/myList.size + "\t(Q)uit\n");
		    
			// Store users choice
			String choice=in.next();
		    
			// Create a switch statement to choose anything from the menu option
			switch(choice)
		    {
		           // Add
		           case "N":
		           case "n": 
		           			{ 
		           				// Add random integer into existing myList
		           				int RNG = ran.nextInt((99999 - 10000) + 1) + 10000;
		           				myList.add(RNG);
		        	   			
		        	   			// Print out the random integer added to myList and where it was positioned at in the list
		        	   			System.out.println(RNG + " was added to location " + myList.find(RNG) );
		        	   			System.out.println();
		        	   			myList.display();
		        	   			
		        	   			
		        	   			// Break Statement
		        	   			break;
		           			}
		          
		           // Remove
		           case "R" :
		           case "r" : 
		           			{
		           				// Create a random integer in the range of the size of myList
		           				int RNG = ran.nextInt(myList.size);
		           				
		           				// Remove random integer in myList by using position 
		           				myList.remove(RNG);
		           				
		           				// Display updated myList with the removed integer
		           				myList.display();
		           				
		           				// Break statement
		           				break;
		           			}
		           
		           // Find		
		           case "F":
		           case "f": 
		        	   		{
		        	   			// Ask the user what number does he/she wants to find in myList
		        	   			System.out.print("\nEnter the number to find: ");
		        	   			
		        	   			// Store the number 
		        	   			number=in.nextInt();
		        	   			
		        	   			// Find the number in myList
		        	   			if(myList.find(number)!=-1)
		        	   			{
		        	   				// Print out what the number the users found and what the position was in myList
		        	   				System.out.println(number+" found at location "+myList.find(number));
		        	   			}
		        	   			else
		        	   			{
		        	   				// Print out what the users number was and state that it was not found
		        	   				System.out.println(number+" not found");
		        	   			}
		        	   			break;
		        	   		}
		         
		           // Quit
		           case "Q" : 
		           case "q" :
		        	   		{
		        	   			// Exit the program
		        	   			System.exit(0);  
		        	   		}
		        	   		
		           // Default case	
		           default :
		           			{
		           				// Tell the user that they chose a wrong menu option
		           				System.out.println("Wrong entry");
		           			}		
		    }
		}
	}

} // end of "main" class



