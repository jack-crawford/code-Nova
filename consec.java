//consec.java   by jack crawford
//takes input creates output

import java.util.Scanner;
public class consec {

   public static void main (String[] args) {
      
      Scanner input = new Scanner(System.in);
      int int1, int2, int3;
      
      System.out.print("int 1 >> ");
      int1 = input.nextInt();
      input.nextLine();
      
      System.out.print("int 2 >> ");
      int2 = input.nextInt();
      input.nextLine();
      
      System.out.print("int 3 >> ");
      int3 = input.nextInt();
      input.nextLine();
      
      if ((int1 < int2) && (int2 < int3)) {
         System.out.println("Well done!");
      } else {
         System.out.println("The numbers " + int1 + " " + int2 + " " + int3 + " are not increasing");
      }
   }
}