// quadratic.java   by jack crawford
//takes in 3 bases outputs roots

import java.util.Scanner;




   public static void main (String[] args) {
      Scanner promptInput = new Scanner(System.in);
      
      int a,b,c;
      double rootOne, rootTwo, determinant;
      
      System.out.print("side a >> ");
      a = promptInput.nextInt();
      promptInput.nextLine();
      
      System.out.print("side b >> ");
      b = promptInput.nextInt();
      promptInput.nextLine();
      
      System.out.print("side c >> ");
      c = promptInput.nextInt();
      promptInput.nextLine();
      
      determinant = Math.sqrt(b*b - 4*a*c);
      
      System.out.println("determinant = " + determinant);
      rootOne = ((-b) + determinant/(2*a));
      rootTwo = ((-b) - determinant/(2*a));

      System.out.println("the two roots should be: " + rootOne + " and " + rootTwo);         
      
   }
   
}