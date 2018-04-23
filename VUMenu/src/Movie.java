import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;

public class Movie {
   String name;
   int seats_filled = 0;
   int seats_total;
   List<Customer> inTheater = new ArrayList<Customer>();
   int price_adult;
   int price_kid;
   int earned;
   int rows;
   int total_occupants = 0;
   public Movie(String name, int seats_total, int price_ad, int price_kid, int rows) {
		this.name = name;
		this.seats_total = seats_total;
		this.price_adult = price_ad;
		this.price_kid = price_kid;
		this.rows = rows;
   }
   public boolean has(String name) {
	   boolean has = false;
	   for(Customer c: inTheater) {
		   if(c.name.equals(name)) {
			   has = true;
		   }
	   }
	   return has;
   }
   public void addGroup(Customer group) {
	   inTheater.add(group);
	   seats_filled += group.getNum();
	   total_occupants += group.getNum();
	   earned += group.getKids() * price_kid + (group.getNum() - group.getKids())* price_adult;
   }
   
   public String getEarnings() {
	   return name + " made $" + earned + ", with " + total_occupants + " total attendees";
   }
   
   public String allGroups() {
	   String to_return = "";
	   int x = 0;
	   for(Customer c: inTheater) {
		   to_return += "[" + x + "] " + c.getName() + " \n";
		   x ++;   
	   }
	   return to_return;
   }
   public void removeGroup(int atIndex ) {
	   inTheater.remove(atIndex);
   }
   public int getSeatsRemaining() {
	      return seats_total - seats_filled;
   }
   public String getCurrentViewers() {
	   String to_return = "In " + name + "\n";
	   to_return += "Seating: " + seats_filled + "/" + seats_total + "\n";
	   for(Customer c: inTheater) {
		   to_return += c.getName() +"\t Party of " + c.getNum() + "\n";
	   }
	   return to_return;
   }
   public String getName() {
	      return name;
   }
   public String toString() {
	   	  int remain = seats_total - seats_filled;
	      return "Now showing: "+ name + ", seats left: " + remain;
   }
   public String getSeatsFilled() {
	   String seating_chart = "";
	   int seatsfilledtemp = seats_filled;
	   for(int i=0; i<rows; i++) {
		   for(int j=0; j<=(seats_total/rows); j++) {
			   if(seatsfilledtemp != 0) {
				   seating_chart += "x  ";
				   seatsfilledtemp --;
			   } else {
				   seating_chart += "o  ";
			   }
				   
			   
		   }
		   seating_chart += "\n";
	   }
	   for(int k=0; k<=(seats_total/rows); k++) {
		   seating_chart += "---";
	   }
	   return seating_chart;
   }



}
