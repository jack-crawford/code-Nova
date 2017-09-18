//factors.java   by jack crawford

import java.util.Scanner;
public class factors {

   public static void main (String[] args) {
      
      Scanner input = new Scanner(System.in);
      
      int integer;
      int factor = 1;
      int increment = 1;
      boolean still_goin = true;
      
      System.out.print("give an int  >> ");
      integer = input.nextInt();

      if (integer % 2 != 0) {
         increment = 2;
      }
      
      while (still_goin) {
         if (integer % factor == 0) {
            System.out.println(factor);
         }
         factor = factor + increment;
         if (factor >= integer) {
            still_goin = false;
            System.out.println(integer);
         }
      }
   }
}