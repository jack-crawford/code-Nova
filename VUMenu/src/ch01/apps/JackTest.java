package ch01.apps;
import java.util.*;
public class JackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		
		System.out.println("factorial of " + x + " = " + fact(x));
		System.out.println("fib of " + x + " = " + fib(x));
		
		
		int fibnum = 0, prev, prevPrev;
		if (x == 0) {
			fibnum = 0;
		}
		if (x == 1) {
			fibnum = 1;
		}
		prevPrev = 0; prev = 1;
		for (int i = 2; i <= x; i++) {
			fibnum = prev + prevPrev;
			prevPrev = prev;
			prev = fibnum;
		}
		System.out.println("inc fib of " + x + " = " + fibnum);
	}
	public static int fact(int x) {
		int fact = 1;
		for(int i=1; i<=x; i++) {
			fact = fact * i;
		}
		return fact;
	}
	public static int GCD(int x, int y) {
		int to_return = 0;
		if(y == 0) {
			to_return = x;
		} else {
			GCD(y, x%y);
		}
		return to_return;
	}
	public static int fib(int x) {
		if(x == 0)
			return 0;
		if(x == 1)
			return 1;
		else {
			return fib(x-1) + fib(x-2);
		}
	}
	public static int lucas(int x) {
		if(x == 0)
			return 0;
		if(x == 1)
			return 1;
		else {
			return lucas(x-1) + lucas(x-2);
		}
	}

}
