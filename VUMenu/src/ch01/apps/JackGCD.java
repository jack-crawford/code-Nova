package ch01.apps;
import java.util.*;

public class JackGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Report for GCD and LCM - jack crawford");
		System.out.println("––––––––––––––––––––––––––––––––––––––");
		System.out.println("Dummy ints: x = 12, y = 68, z = 240");

		int x = 12, y = 68, z = 240;
		System.out.println("GCD of " + x + " and " + y + " is " + GCD(x, y));
		System.out.println("LCM of " + x + " and " + y + " is " + LCM(x,y));
		System.out.println("GCD of " + x + " and " + y + " and " + z + " is " + GCD(GCD(x, y), z));
		System.out.println("LCM of " + x + " and " + y + " and " + z + " is " + LCM(LCM(x,y), z));
		

		Scanner scn = new Scanner(System.in);
		System.out.print("Enter an int: ");
		int input1 = scn.nextInt();
		System.out.print("Enter another int: ");
		int input2 = scn.nextInt();
		System.out.println("GCD of " + input1 + " and " + input2 + " is " + GCD(input1, input2));
		System.out.println("LCM of " + input1 + " and " + input2 + " is " + LCM(input1,input2));
		System.out.print("Enter another int to find for all 3, or 0 to quit: ");
		int input3 = scn.nextInt();
		if (input3 != 0) {
			System.out.println("GCD of " + input1 + " and " + input2 + " and " + input3 + " is " + GCD(GCD(input1, input2), input3));
			System.out.println("LCM of " + input1 + " and " + input2 + " and " + input3 + " is " + LCM(LCM(input1, input2), input3));
		} else {
			System.out.println("thanks!");
		
		}


	}
	public static int GCD(int x, int y) {
		if(y == 0) 
			return x;
		else 
			return GCD(y, x%y);
		
	}
	public static int LCM(int x, int y) {
		//what a beautiful little expression
		return (x * y)/GCD(x, y);
	}
}
