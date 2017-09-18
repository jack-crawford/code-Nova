//evens.java   by jack crawford

import java.util.Scanner;
public class evens {

   public static void main (String[] args) {
      
      Scanner input = new Scanner(System.in);
      
      int integer, num_to_print;
      System.out.print("give an int greater than 1 >> ");
      integer = input.nextInt();
      num_to_print = 2;

      input.nextLine();

      if ((integer < 1) || (integer == 1)) {
         System.out.print("I said greater than 1, silly!");
      } else if (integer > 1){
         num_to_print = integer;
         while (num_to_print >= 1) {
            num_to_print = num_to_print - 1;
            
            if ((num_to_print % 2 == 0) && (num_to_print >= 2)) {
                 System.out.println(num_to_print);
            } 
         }
      }
   }
}