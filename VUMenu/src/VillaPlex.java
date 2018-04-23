import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
import java.util.Random;
public class VillaPlex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		char input;
		System.out.println("Welcome to the Villanova Movie Theater Interactive System");
		System.out.println("––––––––––––––––––––––-");
		System.out.print("First off, put in the number of rows in theater 1:");
		int t1_rows = scan.nextInt();
		System.out.print("Alright, now put in the number of seats in each row:");
		int t1_width = scan.nextInt();
		System.out.print("How much is an adult ticket:");
		int ticketprice = scan.nextInt();
		System.out.print("How much is a child's ticket:");
		int ticketpricek = scan.nextInt();
		Movie theater1 = new Movie("The Phantom Menace", t1_rows * t1_width, ticketprice, ticketpricek, t1_rows);
		System.out.println("Now put in the number of rows in theater 2:");
		int t2_rows = scan.nextInt();
		System.out.println("And the number of seats:");
		int t2_width = scan.nextInt();
		System.out.println("How much is an adult ticket:");
		ticketprice = scan.nextInt();
		System.out.println("How much is a child's ticket:");
		ticketpricek = scan.nextInt();
		Movie theater2 = new Movie("The Shining", t2_rows * t2_width, ticketprice, ticketpricek, t2_rows);
		System.out.println("––––––––––––––––––––––-");
		System.out.println("[1] Customer(s) enter(s) the movie theater");
		System.out.println("[2] Customer is served");
		System.out.println("[3] Customer(s) leave(s) the movie theater");
		System.out.println("[4] Display info about customers waiting for tickets");
		System.out.println("[5] Display seating chart for the first film");
		System.out.println("[6] Display seating chart for the second film");
		System.out.println("[7] Display the number of tickets sold and total earning");
		System.out.println("[8] quit");
		
	    Queue<Customer> line1 = new LinkedList<>();
	    Queue<Customer> line2 = new LinkedList<>();
	    Queue<Customer> expressline = new LinkedList<>();
	    boolean has_started_serving = false;
	    List<Queue<Customer>> lines = new ArrayList<Queue<Customer>>();
	    String[] names = null;
	    int currentlineindex = 0;
	   
		do {
			System.out.print("Enter your choice > ");
			input = (char) scan.next().charAt(0);
			switch (input) {
				case '1': 
					Customer newCustomer = addCustomers(scan, theater1, theater2, names);
					if(newCustomer.kidsExist() && expressline.size()/2 != line1.size()) {
						expressline.add(newCustomer);
					} else {
						if (line1.size() > line2.size() || expressline.size()/2 == line2.size())
							line2.add(newCustomer);
						else
							line1.add(newCustomer);
					}
					break;
				case '2': 
					lines.add(expressline);
				    lines.add(line1);
				    lines.add(line2);
				    lines.add(expressline);
				    //System.out.println(lines);
					if(!has_started_serving) {
						has_started_serving = true;
					}
					System.out.println("What line do you want to serve? (1, 2, or 3) >");
					
					Queue<Customer> currentline = lines.get(scan.nextInt() - 1);
					Customer beingServed = currentline.poll();
					while (currentline.isEmpty()) {
						System.out.println("current line is empty" + currentlineindex);
						if (currentlineindex == 3) 
							currentlineindex = 0;
						else 
							currentlineindex ++;
						currentline = lines.get(currentlineindex);
					}
					beingServed = currentline.poll();
					//this is where the group decides which movie to attend
					
					if (theater1.getSeatsRemaining() < beingServed.getNum() && theater2.getSeatsRemaining() < beingServed.getNum())  {
						System.out.println("Sorry, " + beingServed.getName() + ", there aren't enough seats for your group to fit");
					} else if (theater1.getSeatsRemaining() >= beingServed.getNum() && theater2.getSeatsRemaining() >= beingServed.getNum()) {
						//both theaters have sufficient seating
						if (beingServed.theatre_choice == 1) {
					    		//theater 1
					    		theater1.addGroup(beingServed);
					    } else {
					    		//theater 2
				    			theater2.addGroup(beingServed);
					    }
					}
					
					if (currentlineindex == 3) 
						currentlineindex = 0;
					else 
						currentlineindex ++;
					break;
				case '3': 
					System.out.println("Do you want to remove someone from Theater 1 or 2? > " );
					if(1 == scan.nextInt()) {
						System.out.println(theater1.allGroups());
					} else if (2 == scan.nextInt()) {
						System.out.println(theater2.allGroups());
					}

					break;
				case '4': 
					System.out.println("first line:");
					for(Customer c:line1) {
						System.out.println(c.toString());
					}
					System.out.println("second line:");
					for(Customer c:line2) {
						System.out.println(c.toString());
					}
					System.out.println("express line:");
					for(Customer c:expressline) {
						System.out.println(c.toString());
					}
					break;
				case '5': 
					System.out.println(theater1.getCurrentViewers());
					System.out.println(theater1.getSeatsFilled());
					break;
				case '6': 
					System.out.println(theater2.getCurrentViewers());
					System.out.println(theater2.getSeatsFilled());
					break;
				case '7': 
					
					
					break;
				case '8': 
					System.out.println(theater1.getEarnings());
					System.out.println(theater2.getEarnings());
					theater1 = null;
					theater2 = null;
					line1 = null;
					line2 = null;
					expressline = null;
					//print out earnings
					input = '0';
							
					break;
				default: 
					System.out.println("weird!"); 
					break;
			}
		
			
		} while (input != '0');
	}
	public static Customer addCustomers(Scanner scan, Movie theater1, Movie theater2, String[] names) {
		int numCust;
		String name;
		boolean kids;
		System.out.print("How many in your party? > ");
		numCust = (int) scan.nextInt();
		System.out.print("Who's paying? > ");
		name = scan.next();
		boolean checkList = false;
		if (names != null) {
			checkList = Arrays.asList(names).contains(name);
		}
		//System.out.println("checklist = "+ checkList);
		while (theater1.has(name) || theater2.has(name) || checkList) {
			System.out.print("Sorry, that name's taken!\nChoose a different name for your party > ");
			name = scan.next();
		}
		int kids_ct = 0;
		System.out.print("Any kids? (y/n) > ");
		kids = ((char) scan.next().charAt(0) == 'y');
		if(kids) {
			System.out.print("How many kids? >");
			kids_ct = scan.nextInt();
		}
		System.out.print("which movie would you like to see? (1 or 2) >");
		int theatre = scan.nextInt();
		Customer newCustomer = new Customer(name, numCust, kids_ct, theatre);
		return newCustomer;
	}

}


