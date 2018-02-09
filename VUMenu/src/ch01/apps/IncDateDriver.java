package ch01.apps;

import java.util.Scanner;

public class IncDateDriver {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
    int day, month, year;
 
      
    System.out.println("Enter a date mm dd yyyy:");
    month = scan.nextInt(); day = scan.nextInt(); year = scan.nextInt();
    IncDate d1 = new IncDate(month, day, year);
    
    d1.increment();
    System.out.println(d1);
    
	}
}