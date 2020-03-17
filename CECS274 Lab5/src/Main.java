import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Main {
	
	public static boolean isAnOperator(char c)
	{
		switch(c)
		{
		case '^':
		case '*':
		case '/':
		case '+':
		case '-':
		case '%':
			return true;
		default:
			return false;
		}
	}
	
	public static boolean isANumber(char c)
	{
		return ((int)c) >= 48 && ((int)c) <= 57;
	}
	
	public static boolean isValidExpression(String expr)
	{
		if (isAnOperator(expr.charAt(0)) || isAnOperator(expr.charAt(expr.length()-1)))
		{		
			return false;
		}
		int openParenthCount = 0;
		boolean lastWasOp = false;
		boolean lastWasOpen = false;
		for (char c: expr.toCharArray()) 
		{
			if(c == ' ')
				continue;
			if(c == '(')
			{
				openParenthCount++;
				lastWasOpen = true;
				continue;
			}
			else if(c == ')')
			{
				if(openParenthCount <= 0 || lastWasOp)
				{
					return false;
				}
				openParenthCount--;
				
			}
			else if(isAnOperator(c))
			{
				if(lastWasOp || lastWasOpen)
				{
					return false;
				}
				lastWasOp = true;
				continue;
			}
			else if(!isANumber(c))
			{
				return false;
			}
			lastWasOp = false;
			lastWasOpen = false;
		}
		if(openParenthCount != 0)
			return false;
		if(lastWasOp || lastWasOpen)
			return false;
		return true;
		
	}
	
	public static double evaluatePostfix(String exp)
	{
		

		
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < exp.length(); i++)
		{
			char c = exp.charAt(i);
			if(Character.isDigit(c))
				stack.push(c-'0');
			else
			{
				int val1 = stack.pop();
				int val2 = stack.pop();
				
				switch(c)
				{
				case '^':
					stack.push((int)Math.pow(val2, val1));
					break;
				case '+':
					stack.push(val1+val2);
					break;
				case '-':
					stack.push(val2-val1);
					break;
				case '/':
					stack.push(val2/val1);
					break;
				case '*':
					stack.push(val1*val2);
					break;
				}
			}
		}
		return stack.pop();
		
	}
	
	public static int getPrecedence(char ch)
	{
		switch(ch)
		{
		case '^':
			return 3;
		case '*':
		case '/':
			return 2;
		case '+':
		case '-':
			return 1;
		}
		return -1;
		
	}
	
	public static String infixToPostfix(String exp)
	{	
		String postFix = new String("");
		Stack <Character> stack = new Stack<>();
		for (int i = 0; i < exp.length(); ++i)
		{
			char c = exp.charAt(i);
			if(Character.isDigit(c))
				postFix += c;
			else if(c == '(')
				stack.push(c);
			else if(c == ')')
			{
				while(!stack.isEmpty() && stack.peek() != '(')
					postFix += stack.pop();
				if(!stack.isEmpty() && stack.peek() != '(')
					return "Invalid Expression";
				else
					stack.pop();
				
		
			}
			else
			{
				while(!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.peek()))
					postFix+= stack.pop();
				stack.push(c);
				
				
			}
				
		}
		while(!stack.isEmpty())
			postFix += stack.pop();

		return postFix;
		
	}
	
	public static void main(String[] args)
	{
		String expr;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an equation: ");
		expr = in.nextLine();
		
		String exprCopy = expr;
		exprCopy = exprCopy.replaceAll("\\+", " + ");
		exprCopy = exprCopy.replaceAll("\\-", " - ");
		exprCopy = exprCopy.replaceAll("\\*", " * ");
		exprCopy = exprCopy.replaceAll("\\/", " / ");
		exprCopy = exprCopy.replaceAll("\\(", " ( ");
		exprCopy = exprCopy.replaceAll("\\)", " ) ");
		exprCopy = exprCopy.replaceAll("\\^", " ^ ");
		System.out.println(exprCopy);
		String delims = "[ ]+";
		String[] token = exprCopy.split(delims);
		
		if(isValidExpression(exprCopy))
		{
			System.out.print("RPN :");
			System.out.println(infixToPostfix(expr));
			System.out.print("Answer: ");
			System.out.println(evaluatePostfix(infixToPostfix(expr)));
		}
		else
		{
			System.out.println("not a valid expression");
		}
	}
}


