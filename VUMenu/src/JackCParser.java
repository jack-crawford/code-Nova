import java.util.Scanner;
import java.util.Stack;
import java.util.*;
import javax.swing.*;


public class JackCParser {

	public static void main(String[] args) 
	{
		String input;
		
//		Scanner scn = new Scanner(System.in);
//		System.out.print("Please enter a string: ");
//		input = scn.nextLine();
//		balanceCheck(input);

		
		System.out.println("Jack Crawford");
		System.out.println("1052, February 1, 2018");
		System.out.println("Welcome to the C++ delimiter Checker");
		System.out.println("Here's some sample tries:");
		balanceCheck("()<<");
		balanceCheck("{{}}<<<");

		//Interesting assignment!
		//
	}
	public static void balanceCheck(String input) {
		boolean isBalanced = true;
		char delim, temp;
		int pointer = 0;
		Stack balanced = new Stack();
		while(isBalanced && pointer < input.length())
		{
			delim = input.charAt(pointer);
			if (delim == '<' || delim == '>') {
				if(delim == '<') {
					if(balanced.empty()){
						balanced.push(delim);
					} else if((char) balanced.peek() == '<') {
						balanced.pop();
					} else if ((char) balanced.peek() == '(' || (char) balanced.peek() == '{' || (char) balanced.peek() == '[') {
						balanced.push(delim);
					}
					
				}
				if(delim == '>') {
					if(balanced.empty()){
						balanced.push(delim);
					} else if((char) balanced.peek() == '>') {
						balanced.pop();
					} else if ((char) balanced.peek() == '(' || (char) balanced.peek() == '{' || (char) balanced.peek() == '[') {
						balanced.push(delim);
					} else if((char) balanced.peek() == '<') {
						balanced.pop();
					}
				} 
			} else {
				if(isLHS(delim))
					balanced.push(delim);
				
				if(isRHS(delim))
				{
					if(balanced.empty())
						isBalanced = false;
					else
					{
						temp = (char) balanced.peek();
						if(areMates(temp, delim))
							balanced.pop();
						else
							isBalanced = false;
					}
				}
			}
			pointer++;
			
	
		}
		
		if(!balanced.empty())
			isBalanced = false;
		
		if(isBalanced)
			System.out.println(input + " is balanced!");
		else
			System.out.println(input + " is not balanced");
			
	}
	public static boolean isLHS(char c)
	{
		if(c == '[' || c == '{' || c == '(' || c == '<') {
			return true;
		}
		else
			return false;	
	}
	
	public static boolean isRHS(char c)
	{
		if(c == ']' || c == '}' || c == ')' || c == '>') 
			return true;
		else
			return false;		
	}
	
	public static boolean areMates(char lhs, char rhs)
	{
		if(lhs == '[' && rhs == ']')
			return true;
		if(lhs == '{' && rhs == '}')
			return true;
		if(lhs == '(' && rhs == ')')
			return true;
		if(lhs == '<' && rhs == '>')
			return true;
		
		return false;
	}

}