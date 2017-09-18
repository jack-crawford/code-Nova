//triangle.java   by jack crawford

import java.util.Scanner;
public class triangle {

   public static void main (String[] args) {
      
      Scanner input = new Scanner(System.in);
      
      int int1, int2, int3;
      
      System.out.print("leg 1 >> ");
      int1 = input.nextInt();
      input.nextLine();
      
      System.out.print("leg 2 >> ");
      int2 = input.nextInt();
      input.nextLine();
      
      System.out.print("leg 3 >> ");
      int3 = input.nextInt();
      input.nextLine();

      if ((int1 == int2) && (int2 == int3)) {
         System.out.println("Equilateral!");
      } else if ((int1 == int2) || (int2 == int3) || (int1 == int3)) {
         System.out.println("An isoceles!!");

      } else if ((int1 + int2 > int3) && (int3 + int1 > int2) && (int3 + int2 > int1)) {
         System.out.println("A triangle!");
      } else {
         System.out.println("Not a triangle!");

      }
      
   }
}