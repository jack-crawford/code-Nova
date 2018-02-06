// stringMessing.java   by jack crawford
//takes input creates output

import java.util.Scanner;
public class stringMessing {

   public static void main (String[] args) {
      String strInput;
      Scanner prompt = new Scanner(System.in);
      System.out.print("input a string >> ");
      strInput = prompt.nextLine();
      System.out.println(strInput);
      
      System.out.println(strInput.length());
      int lengthStr = strInput.length();
      System.out.println(strInput.charAt(0));
      System.out.println(strInput.charAt(lengthStr - 1));
      System.out.println(strInput.toUpperCase());
      System.out.println(strInput.replace("e", "3").replace("E", "3"));
   } 
}