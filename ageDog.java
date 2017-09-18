// ageDog.java   by jack crawford
//takes input creates output

import java.util.Scanner;
public class ageDog {

   public static void main (String[] args) {
      
      Scanner input = new Scanner(System.in);
      int age, dogAge;
      String name;
      
      System.out.print("what's your age? >> ");
      age = input.nextInt();
      input.nextLine();
      
      System.out.print("what's your name? >> ");
      name = input.next();
      
      dogAge = age * 7;
      
      System.out.println("Hey, " + name + ", you're " + dogAge + " in dog  years");
     }
}
      
      