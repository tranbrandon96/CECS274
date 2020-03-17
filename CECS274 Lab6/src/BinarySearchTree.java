import java.util.Scanner;
public class BinarySearchTree 
{		
	// function to print Binary Search Tree
	public static void printBST(String [] arrayValue)
	{		
		System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+arrayValue[1]+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t");
		System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t");
		System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+arrayValue[2]+"----------------------------------------------"+"^"+"-----------------------------------------------"+arrayValue[3]);
		System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
		System.out.println("\t"+"\t"+"\t"+arrayValue[4]+"----------------------"+"^"+"-----------------------"+arrayValue[5]+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+arrayValue[6]+"----------------------"+"^"+"-----------------------"+arrayValue[7]);
	    System.out.println("\t"+"\t"+"\t"+"|"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"|");
	    System.out.println("\t"+"\t"+arrayValue[8]+"------"+"^"+"-------"+arrayValue[9]+"\t"+"\t"+"\t"+"\t"+arrayValue[10]+"------"+"^"+"-------"+arrayValue[11]+"\t"+"\t"+"\t"+"\t"+arrayValue[12]+"------"+"^"+"-------"+arrayValue[13]+"\t"+"\t"+"\t"+"\t"+arrayValue[14]+"------"+"^"+"-------"+arrayValue[15]);
	    System.out.println("\t"+"\t"+"|"+"\t"+"\t"+"|"+"\t"+"\t"+"\t"+"\t"+"|"+"\t"+"\t"+"|"+"\t"+"\t"+"\t"+"\t"+"|"+"\t"+"\t"+"|"+"\t"+"\t"+"\t"+"\t"+"|"+"\t"+"\t"+"|");
	    System.out.println("\t"+"    "+arrayValue[16]+"---"+"^"+"---"+arrayValue[17]+"\t"+"    "+arrayValue[18]+"--"+"^"+"---"+arrayValue[19]+"\t"+"\t"+"\t"+"    "+arrayValue[20]+"--"+"^"+"---"+arrayValue[21]+"\t"+"    "+arrayValue[22]+"--"+"^"+"---"+arrayValue[23]+"\t"+"\t"+"\t"+"    "+arrayValue[24]+"--"+"^"+"---"+arrayValue[25]+"\t"+"    "+arrayValue[26]+"---"+"^"+"---"+arrayValue[27]+"\t"+"\t"+"\t"+"    "+arrayValue[28]+"--"+"^"+"---"+arrayValue[29]+"\t"+"    "+arrayValue[30]+"--"+"^"+"---"+arrayValue[31]);

	    
	} // end of "printBST" function
	
	// main
	public static void main(String []args)
	{
		Tree BST = new Tree();
		char loop = 't';
		char choice;
		String [] arrayBST = new String[33];
		
		BST.Array(arrayBST);
		BST.levelTraversal(arrayBST);
		
		// Menu option
		while(loop == 't')
		{
			// Continuously print the Binary Search Tree
			printBST(arrayBST);
			
			System.out.println();
			BST.count();
			System.out.println();
			
			// Binary Search Tree is empty
			if(arrayBST[1] == ".")
			{
				System.out.println("Sorted List: ");
				System.out.println("Tree Height: ");
				System.out.println("Root value: ");
				System.out.println("Item count: ");
			}
			
			// Binary Search Tree is not empty
			else	
			{
				System.out.print("Sorted List: ");
				BST.sortedList();
				System.out.println();
				System.out.println("Tree Height: " +BST.getHeight());
				System.out.println("Root Value: " +arrayBST[1]);
				System.out.println("Item count: " + BST.size());
			}
			
			// Display Menu options
			System.out.print("(A)dd Item" + "\t(R)emove Item" + "\t(F)ind Item" + "\t(I)nitialize Tree" + "\t(N)ew Tree" + "\t(Q)uit" );
			System.out.print("\nEnter choice: ");
			Scanner in = new Scanner(System.in);
			choice = in.next().charAt(0);
			in.nextLine();
			switch(choice) 
			{
			
				// Add
				case'a':
				case'A':
				{
					System.out.println("Enter an integer to add to the Binary Search Tree");
					int num = in.nextInt();
					BST.add(num);
					BST.levelTraversal(arrayBST);
					break;
				}
			
				// Remove
				case 'r':
				case 'R':
				{
					System.out.println("Enter integer to delete from the Binary Search Tree");
					int num = in.nextInt();
					in.nextLine();
					
					BST.find(num);
					BST.remove(num);
					
					System.out.println(num + " was deleted from the Binary Search Tree");
					BST.levelTraversal(arrayBST);
					break;
				}
				
				// Find
				case 'f':
				case 'F':
				{
					System.out.println("Enter integer to find from the Binary Search Tree");
					int num = in.nextInt();
					
					BST.find(num);
					if(BST.level() == 0)
					{
						System.out.println("number was not found");
					}
					else
					{
						System.out.println(num + " was found on level " +BST.level());
					}
					
					in.nextLine();
					break;
				}
			
				// Initialize
				case 'i':
				case 'I':
				{
					
						BST.initialize();
					BST.levelTraversal(arrayBST);
					break;
				}
			
				// New
				case 'n':
				case 'N':
				{
					BST = new Tree();
					BST.Array(arrayBST);
					break;
				}
				
				// Quit
				case 'q':
				case 'Q':
				{
					loop = 'f';
					break;
				}
				
			} // end of switch statements
			
		} // end of while loop
			
	} // end of "main" class

} // end of "BinarySearchTree" class