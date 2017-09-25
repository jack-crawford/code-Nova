//random1.java 

import java.util.Random;
public class random1
{
   public static void main (String[] args)
   {
      Random randd = new Random();
      int random_number, random_number2;
      
      random_number = randd.nextInt(99) + 1;
      System.out.println(random_number);
   
      random_number2 = randd.nextInt(99) + 1;
      System.out.println(random_number2);
      
      if (random_number > random_number2) {
          System.out.println("first is greater than second");
      } else if (random_number < random_number2) {
          System.out.println("second is greater than first");

      } else {
         System.out.println("they're equal");

      }
   }
   
}