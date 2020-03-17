// LinkedList class
public class LinkedList
{
   // Private data members
   private Node head;
   
   // Public date members
   public int size = 0;
   public int average = 0;
   public int sum = 0;
   
   // Default constructor
   LinkedList()
   {
       // Initialize head to null 
	   head = null;
     
   }
   
   // Add function 
   public void add(int value)
   {
	   // Create empty node object
	   Node nodePtr, pointer, temp = null;
	   
	   // Create node object including value and next
	   nodePtr = new Node(value,null);
	   
	   // Boolean declaration and initializing to false
       boolean ins = false;
       
       // Case 1: Initialize first node in myList as head
       if (head == null)
       {
    	  head = nodePtr;
       }
       
       // Case 2: Initialize new node as head in existing node and assign it head
       else if (value <= head.getValue())
       {
    	   // New node .next reference is assign to head
    	   nodePtr.setNext(head);
    	   
    	   // Head is the new nodePtr
           head = nodePtr;
       }
       
       // Case 3: Between two nodes and in the end
       else
       {
           // Assign empty nodes to head
    	   temp = head;
           pointer = head.getNext();
          
           // Create a while loop to traverse through myList
           while(pointer != null)
           {
        	   // Between two nodes
        	   if (value >= temp.getValue() && value <= pointer.getValue())
               {
                  
            	   temp.setNext(nodePtr);
            	   nodePtr.setNext(pointer);
                   ins = true;
                   break;
               }
               
        	   // In the end
        	   else
               {
                   temp = pointer;
                   pointer = pointer.getNext();
               }
           }
           
           
           if (ins == false)
           {
               temp.setNext(nodePtr);
           }
       }
       
       // Sum value
       sum = sum + value;
       
       // Increment size
       size++;
       
      
   }

   // Find function
   public int find(int value)
   {
       // Assign temporary node to head
       Node temp = head;
       
       // Declare and Initialize count integer to 1. 
       int count=1;
       
       // Traverse through myList until it hits null
       while(temp!=null )
       {
           // If the value is found, return the position
    	   if(temp.getValue()==value)
           {
               return count;
           }
           count++;
           
           temp=temp.getNext();
       }
       return -1;
   }
   
   // Remove function
   public void remove(int position){
	   // Case 1: Removing the node when it at in front
	   if (position == 1) 
       {
		   // Initialize head to head reference .next
		   head = head.getNext();
           
           // Decrement size
           size--; 
           return ;
       }
	   
	   // Case 2: Remove the node when it is at the end
       if (position == size) 
       {
           // Initialize node pointer to head
    	   Node pointer = head;

    	   // Traversal through myList
           for (int i = 1; i < size - 1; i++)
           {
               pointer = pointer.getNext();
           }
           
           // Set the nodePtr .next to null
           pointer.setNext(null);            
          
           // Decrement size
           size --;
           return;
       }
       
       // Create a node pointer and initialize to head
       Node pointer = head;
       
       // Position is not one less
       position = position - 1 ;
       
       // Traverse through myList 
       for (int index = 1; index < size - 1; index++) 
       {
           // Index is equal to the random position
    	   if (index == position) 
           {
               // Initialize temporary to value being removed and state the value and the position
    		   Node temp = pointer.getNext();
               System.out.println(temp.getValue() +" was removed at location "+ find(temp.getValue()));
               System.out.println();
               
               // Assign the nodes to existing nodes in the list while the current node is being deleted
               temp = temp.getNext();
               pointer.setNext(temp);
              
               // Break statement
               break;
           }
    	   
    	
           pointer = pointer.getNext();
       }
       
       // Decrement size
       size-- ;
	   
   }
   
   // Display function
   public void display()
   {
	   // Assign node temp to head
	   Node temp = head;
	   
	   // Initialize grid to 0 to use to create a grid 10x10
       int grid = 0;
       
       // Create a while loop to traverse through myList
       while(temp != null)
       {
           // Print out myList
    	   System.out.print(temp.getValue()+" ");
    	   
    	   // Move the temporary node to the next node
           temp=temp.getNext();
           
           // Increment grid 
           ++grid;
           
           // If statements to print a newline to make a 10x10 grid
		   if (grid == 10)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 20)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 30)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 40)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 50)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 60)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 70)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 80)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 90)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 100)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 110)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 120)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 130)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 140)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 150)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 160)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 170)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 180)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 190)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 200)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 210)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 220)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 230)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 240)
		   {
			   System.out.println();
		   }
		   
		   if (grid == 250)
		   {
			   System.out.println();
		   }
		   
       }
       System.out.println("");
   }
   
} // end of "LinkedList" class