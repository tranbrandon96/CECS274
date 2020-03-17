import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Scanner;

public class Stack <T>{
	private ArrayList<T> stack = new ArrayList<T> ();
	private int top = 0;
	
	public int size()
	{
		return top;
	}
	
	public void push(T item)
	{
		stack.add(top++, item);
		
	}
	
	public T pop()
	{
		
		return stack.remove(--top);
	}
	
	public T peek()
	{
		if(top != 0)
		{
			return stack.get(top-1);
		}
		else
		{
			throw new EmptyStackException();
		}
	}
	
	public boolean isEmpty()
	{
		if(top == 0)
		{
			return true;
			
		}
		return false;
		
	}
}
