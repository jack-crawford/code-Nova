//
// PasserRating.java
//
// Demonstrates boolean expressions to calculate passer rating formula
// 
import java.util.Scanner;

public class PasserRating 
{
      public static void main (String[] args) 
      {
      
         double ATT;
         double Comp;
         double YDS;
         double TD;
         double INT;
         double Passer_Rating;
         
         Scanner scan = new Scanner(System.in);
         
         System.out.print("Enter number of passing attempts ");
         ATT = scan.nextDouble();  
         
         System.out.print("Enter number of completions ");
         Comp = scan.nextDouble();
         
         System.out.print("Enter number of passing yards ");
         YDS = scan.nextDouble();
         
         System.out.print("Enter number of touchdown passes ");
         TD = scan.nextDouble();
         
         System.out.print("Enter number of interceptions ");
         INT = scan.nextDouble();       
         
         double a = ((Comp / ATT) - .3) * 5;
         if (a > 2.375)
            a = 2.375;
         else 
            if (a < 0)
               a = 0;
               
         double b = ((YDS / ATT) - 3) * .25;
         if (b > 2.375)
            b = 2.375;
         else 
           if (b < 0)
             b = 0;
           
             
         double c = (TD / ATT) * 20;
         if (c > 2.375)
            c = 2.375;
         else 
           if (c < 0)
             c = 0;
           
         
         double d = (2.375 - ((INT / ATT) * 25));
         if (d > 2.375)
            c = 2.375;
         else 
           if (d < 0)
             d = 0;
         Passer_Rating = ((a + b + c + d) / 6) * 100;
         

         System.out.println("Drew Brees' passer rating is " + Passer_Rating + ".");
      }
}