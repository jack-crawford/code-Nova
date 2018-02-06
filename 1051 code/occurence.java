// occurence.java   by jack crawford
//takes input creates output

import java.util.Scanner;
public class occurence {

   public static void main (String[] args) {
      String charact, phrase;
      Scanner prompt = new Scanner(System.in);
      System.out.print("a letter >> ");
      charact = prompt.nextLine();
      System.out.println(charact);
      
      System.out.print("a phrase >> ");
      phrase = prompt.nextLine();
      System.out.println(phrase);
      int count = 0;
      int num_of_occ = 0;
      while (count < phrase.length()) {
         System.out.println(String.valueOf(phrase.charAt(count)) + " and " + charact);
         if (String.valueOf(phrase.charAt(count)).equals(charact)) {
            num_of_occ ++;
         } 
         count ++;     
      }
      System.out.println(charact + " appears " + num_of_occ + " times");
   }
}