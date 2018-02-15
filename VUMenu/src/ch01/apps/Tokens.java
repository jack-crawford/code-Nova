package ch01.apps;
import java.util.*;
public class Tokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack RPN = new Stack();
		String s1;
		String s2 = new String("Hello");
		StringBuilder s3 = new StringBuilder("Build It");
		s3.append(" Beautiful");
		s1 = "To B oar knot 	2, b";
		String sNums = "2 3 11 - / 9 +";
		//sNums = "4 3 *";
		StringTokenizer st = new StringTokenizer(sNums);
		while(st.hasMoreTokens()) {
			String nextToken = st.nextToken();
			System.out.println(nextToken);
			double val1, val2, num;
			if(isOp(nextToken)) {
				//peek/pop or whatever
				val1 = (double) RPN.peek();
				RPN.pop();
				val2 = (double) RPN.peek();
				RPN.pop();
				System.out.println(val1 + " " + nextToken + " " + val2);
				switch(nextToken) {
				case "*": 
					System.out.println(val1 * val2);
					num = val1 * val2;
					RPN.push(num);
					break;
				case "/": 
					System.out.println(val1 / val2);
					num = val1 / val2;
					RPN.push(num);
					break;
				case "+": 
					System.out.println(val1 + val2);
					num = val1 + val2;
					RPN.push(num);
					break;
				case "-": 
					System.out.println(val1 - val2);
					num = val1 - val2;
					RPN.push(num);
					break;
				default:
					System.out.println("Something weird");
				}
			} else {
				num = Double.parseDouble(nextToken);
				RPN.push(num);
			}
		}
		//7 + 11 - 3 
	}
	public static boolean isOp(String op) {
		if (op.equals("*") || op.equals("/") || op.equals("+") || op.equals("-")){
			return true;
		} else {
			return false;
		}
	}

}
