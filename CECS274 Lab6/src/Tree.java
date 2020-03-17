public class Tree 
{	
	// private data members
	private Node root;
	private Node parent;
	private int index;
	private int count;
	private int level;
	
	// constructor
	public Tree()
	{ 
		root = null;
	} // end of "tree" constructor

	// Add value into Binary Search Tree with one parameter
	public void add(int value)
	{
		Node temp = new Node(value);
		if(root == null)
		{
			root = temp;
		}
		else
		{
			add(root, temp);
		}
	} // end of "add" function with one parameter
	
	// Add value into Binary Search Tree with two parameters
	private void add(Node temp, Node update)
	{
		if(update.getValue() < temp.getValue())
		{
			if(temp.getLeft() == null)
			{
				temp.setLeft(update);
			}
			else
			{
				add(temp.getLeft(),update);
			}
		}
		else
		{
			if (temp.getRight() == null)
			{
				temp.setRight(update);
			}
			else
			{
				add(temp.getRight(),update);
			}
		}
	} // end of "add" function with two parameter
	
	// Find the value in the Binary Search Tree with one parameter
	public void find(int value)
	{
		level = 0;
		Node temp = root;
		if(value == temp.getValue())
		{
			parent = root;
			level = 1;
		}
		else
		{
			parent = temp;
			level++;
			find(value, temp);
		}
	} // end of "find" function with one parameter
	
	// Find the value in the Binary Search Tree with two parameter
	private void find(int num, Node temp)
	{
		if(num < temp.getValue())
		{	
			if(temp.getLeft() == null)
			{
				level = 0;
			}
			else
			{
				parent = temp;
				level++;
				find(num, temp.getLeft());
			}
		}
		else if (num > temp.getValue())
		{
			
			if(temp.getRight() == null)
			{
				level = 0;
			}
			else
			{
				parent = temp;
				level++;
				find(num, temp.getRight());
			}
		}
	} // end of "find" function with two parameter
	
	// Return the level of the binary search tree
	public int level()
	{
		return level;
	}
	
	// Find the height of the Binary Search Tree with no parameters
	public int getHeight()
	{
		return getHeight(root) + 1;
	} // end of "getHeight" function no parameters
	
	// Find the height of the Binary Search Tree with one parameter
	int getHeight(Node temp) 
	{
		 if (temp == null)
		 {
			 return -1;
		 }

		 int left = getHeight(temp.getLeft());
		 int right = getHeight(temp.getRight());
		 
		 if(left > right)
		 {
			 return left + 1;
		 }
		 
		 else
		 {
			 return right + 1;
		 }
	} // end of "getHeight" function with one parameter

	// Remove function with one parameter
	public void remove(int x)
	{
		Node temp = root;
		if(temp.getValue() == x)
		{
			temp = temp.getRight();
			while(temp.getLeft()!= null)
			{
				parent = temp;
				temp = temp.getLeft();
			}
			Node temp2 = root;
			root.setValue(temp.getValue()); 
			temp.setValue(temp2.getValue());	
			remove(x,temp);
		}
		else
		{
			find(x);
			remove(x,temp);
		}
	
	} // end of "remove" function with one parameter
	
	// Remove function with two parameter
	public void remove(int value, Node temp)
	{	
		if(parent.getValue() < value)
		{
			temp = parent.getRight();
		}
		else if(parent.getValue() > value)
		{
			temp = parent.getLeft();
		}
		else
		{
			temp = parent;
		}

		
		if(temp.getRight()!=null & temp.getLeft()!=null)
		{
			Node n = temp;
			parent = temp;
			temp = temp.getRight();
			while(temp.getLeft() != null)
			{
				parent = temp;
				temp = temp.getLeft();
			}
	
			int temp2 = temp.getValue();
			temp.setValue(temp.getValue());
			temp.setValue(temp2); 
			
			if(parent.getLeft().getValue()== temp.getValue())
			{
				parent.setLeft(null);
				return;
			}
			else
			{
				parent.setRight(null);
				return;
			}
		
		}
			
		if(temp.getRight() == null & temp.getLeft() == null)
		{
			
			if(parent.getValue() < temp.getValue())
			{
				parent.setRight(null);
			}
			else
			{
				parent.setLeft(null);
			}
		}
		
		
		else
		{
			
			if(parent.getValue() > value)
			{
				if(parent.getLeft().getLeft() == null)
				{
					
					parent.setLeft(parent.getLeft().getRight());
				}
				else
				{  
					parent.setLeft(parent.getLeft().getLeft());
				}
			}
			else
			{
				if(parent.getRight().getLeft() == null)
				{ 
					parent.setRight(parent.getRight().getRight());
				}
				else
				{
					
					parent.setRight(parent.getRight().getLeft());
				}
			}
		}
		
	} // end of "remove" function with two parameters
	
	// Display the sorted list with no parameters
	public void sortedList()
	{
		if(root == null)
		{
			return;
		}
		else
		{
			sortedList(root);
		}
	} // end of "sortedList" function with no parameter
	
	// Display the sorted list with one parameter
	private void sortedList(Node temp)
	{
		if(temp == null)
		{
			return;
		}
		else
		{
			sortedList(temp.getLeft());
			System.out.print(temp.getValue());
			System.out.print(", ");
			sortedList(temp.getRight());
		}
	} // end of "sortedList" function with one parameter
	
	// Create array with 1 parameter
	public void Array(String [] arr)
	{
		if(root == null)
		{
			for(int index = 0; index < 32; index++)
			{
				arr[index] = ".";
			}
			return;
		}
		else
		{
			index = 1;
			Array(arr,root);
		}
	} // end of "Array" function with 1 parameter
	
	// Create array with two parameters
	public void Array(String [] arr, Node temp)
	{
		
		if(temp == null)
		{
			arr[index] = ".";
			return;
		}
		else
		{
			arr[index++] = String.valueOf(temp.getValue());
			Array(arr,temp.getLeft());
			Array(arr,temp.getRight());
		}
		
	} // end of "Array" function with two parameters
	
	// Initialize Binary Search Tree with values
	public void initialize()
	{
		add(50);
		add(30);		
		add(70);
		add(60);
		add(20);		
		add(40);		
		add(80);		
		add(10);		
		add(25);		
		add(35);		
		add(45);		
		add(55);		
		add(65);		
		add(75);		
		add(85);		
		add(5);		
		add(17);		
		add(21);		
		add(27);		
		add(31);		
		add(37);		
		add(41);		
		add(47);		
		add(51);		
		add(57);		
		add(61);	
		add(67);		
		add(74);	
		add(77);	
		add(81);		
		add(89);
	} // end of "initialize" function
	
	// Count the Binary Search Tree with no parameter
	 public void count()
	 {
		 if(root == null)
			{
			 	
				return;
			}
			else
			{
				count = 0;
				count(root);
			}
		 
	 } // end of "count" function with no parameter
	 
	 // Count the Binary Search Tree with one parameter
	 public void count(Node temp)
	 {
			if(temp == null)
			{
				return;
			}
			else
			{
				count(temp.getLeft());
				count++;
				count(temp.getRight());
			}
	 } // end of "count" function with one parameter
 
	 // Return the size of the Binary Search Tree
	 public int size()
	 {
		 return count;
	 } // end of "size" function 
	   
	 // Traversal through the Binary Search Tree to figure out the level
	 void levelTraversal(String [] temp)
	 {
	     int height = getHeight(root);
	     if(height == 0)
	     {
	    	 for(int i =0; i < temp.length; i++)
	    	 {
	    		 temp[i] = ".";
	    	 }
	    	 return;
	     }
	     int i;
	     index = 1;
	     for (i = 1; i <= height + 1; i++)
	     {
	         createArray(root, i, temp);
	     }
	 } // end of "levelTraversal" function
	 
	 // Create array for Binary Search Tree
	 void createArray(Node root ,int level, String []x)
	 {
	     if (root == null)
	     { 
	    	 x[index++] = ".";
	         return;
	     }
	     if (level == 1)
	    	
	         x[index++] = String.valueOf(root.getValue());
	     else if (level > 1)
	     {
	         createArray(root.getLeft(), level - 1, x);
	         createArray(root.getRight(), level - 1, x);
	     }
	 } // end of "createArray" function
} // end of "Tree" class

