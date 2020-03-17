// Node class
public class Node 
{
	
	// Private data members
	private int value;
    private Node next;
 
    // Default constructor
    public Node()
    {
    	// Initialize private data members
    	value = 0;
    	next = null;  
    }    
    
    // Type conversion constructor
    public Node(int value,Node next)
    {
        this.value = value;
        this.next = next;
    }    
    
    // Function to get .next to next node  
    public Node getNext()
    {
        return next;
    }    
    
    // Function to get .value from current Node  
    public int getValue()
    {
        return value;
    }
    
    //Function to set .next to next Node  
    public void setNext(Node next)
    {
        this.next = next;
    }    
   
    // Function to set .value to current Node  
    public void setValue(int value)
    {
        this.value = value;
    }    
    
    
} // end of "Node" class
