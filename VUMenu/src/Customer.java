
public class Customer {	
   String name;
   int number_in_party;
   int kids = 0;
   int theatre_choice;
   public Customer(String name, int num, int kids, int theatre) {
		this.name = name;
		this.number_in_party = num - kids;
		this.kids = kids;
		this.theatre_choice = theatre;
   }
   public int getNum() {
	      return number_in_party;
   }
   public String getName() {
	      return name;
   }
   public String toString() {
	      return name + ", party of " + number_in_party + ", kids: " + kids;
   }
   public boolean kidsExist() {
	      return kids != 0;
   }
   public int getKids() {
	   return kids;
   }
}
