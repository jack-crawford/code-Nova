// nameReorder.java   by jack crawford
//takes input creates output

import java.util.Scanner;
public class nameReorder {

   public static void main (String[] args) {
      
      Scanner promptInput = new Scanner(System.in);
      String first, middle, last;
      
      System.out.print("what's your first name? >> ");
      first = promptInput.next();
      
      System.out.print("what's your middle initial? >> ");
      middle = promptInput.next();

      System.out.print("what's your last name? >> ");
      last = promptInput.next();
      
      System.out.println(last + ", " + first + " " + middle + ".");
   }
}