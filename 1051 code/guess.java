// guess.java   by jack crawford
//takes input creates output

import java.util.Scanner;
import java.util.Random;
public class guess {

   public static void main (String[] args) {
      
            
      
      Random randd = new Random();
      int random_number, guess = 0;
      random_number = randd.nextInt(999) + 1;
      
      Scanner prompt = new Scanner(System.in);

      while (random_number != guess) {
         System.out.print("guess! >> ");
         guess = prompt.nextInt();
         System.out.println(guess);
         if (random_number > guess) {
            System.out.println("low");
         } else if (random_number < guess) {
            System.out.println("high");
         } else{
            System.out.println("you win!");
         }
      }
   }
}