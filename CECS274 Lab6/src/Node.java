// Name: Brandon Tran
// Class: CECS 274-05
// Project Name: Program #6 - Binary Search Tree
// Due Date: December 11, 2018

public class Node 
{
	// private data members 
	private Node rightPtr;
	private Node leftPtr;
	private int value;
	
	// constructor
	public Node(int val)
	{
		value = val;
		rightPtr = null;
		leftPtr = null;
	} // end of "Node" constructor
	
	// function to get value of node
	public int getValue()
	{
		return value;
	} // end of "getValue" function
	
	// function to set value
	public void setValue(int val)
	{
		value = val;
	} // end of "setValue" function
	
	// function to get left node
	public Node getLeft()
	{
		return leftPtr;
	} // end of "getLeft" function
	
	// function to set left node
	public void setLeft(Node n)
	{
		leftPtr = n;
	} // end of "setLeft" function
	
	// function to get right node
	public Node getRight()
	{
		return rightPtr;
	} // end of "getRight" function
	
	// function to set right node
	public void setRight(Node n)
	{
		rightPtr = n;
	} // end of "setRight" function
	
}	// end of "Node" class