import java.util.*;
public class Parens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		Stack balanced = new Stack();
		boolean isBalanced = true;    
		char delim;
		char temp;

		int pointer = 0;
		
		System.out.println("Hi");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a buttload of {}[]()'s");
		input = scn.nextLine();
		while(isBalanced && pointer < input.length()-1) {
			delim = input.charAt(pointer);
			if(isRHS(delim)) {
				if (balanced.isEmpty()) 
					isBalanced = false;
				else {
					temp = (char) balanced.peek();
					if(isMate(temp, delim))
						balanced.pop();	
				}
			}
				
			if(isLHS(delim))
				balanced.push(delim);
			pointer ++;
		}
	}
	public static boolean isLHS(char c) {
		if(c== '['||c== '{'||c== '('||c== '<') 
			return true;
		else
			return false;
	}
	public static boolean isRHS(char c) {
		if(c== ']'||c== '}'||c== ')'||c== '>') 
			return true;
		else
			return false;
	}
	public static boolean isMate(char lhs, char rhs) {
		if (lhs == '[' && rhs == ']')
			return true;
		if (lhs == '{' && rhs == '}') 
			return true;
		if (lhs == '(' && rhs == ')')
			return true;
		if (lhs == '<' && rhs == '>')
			return true;
		return false;
	}
}
