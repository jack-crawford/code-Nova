// shoeCost4.java   by jack crawford
//takes input creates output

import java.util.Scanner;
public class shoeCost4 {

   public static void main (String[] args) {
      
      Scanner input = new Scanner(System.in);
      int cost, wantBuy, didBuy, wantPrice, didPrice, saved, should_cont;
      boolean continU = true;
      while (continU) {
         System.out.print("how much is a pair? >> ");
         cost = input.nextInt();
         input.nextLine();
         
         System.out.print("how many do you want? >> ");
         wantBuy = input.nextInt();
         input.nextLine();
         
         System.out.print("how many did you buy? >> ");
         didBuy = input.nextInt();
         input.nextLine();
         
         wantPrice = wantBuy * cost;
         didPrice = didBuy * cost; 
         saved = wantPrice - didPrice;
         if (saved > 0) {
            System.out.println("Hey, you've saved $" + saved);
         } else if (saved < 0) {
            System.out.println("Hey, you overspent by $" + Math.abs(saved));
         } else {
            System.out.println("Hey you spent exactly as much as you could have!");
         }
         
         System.out.print("Do you want to run again? (1 for yes, 0 for no) >> ");
         should_cont = input.nextInt();
         input.nextLine();
         
         if (should_cont == 0) {
            continU = false;
         
         }
      }
   }
}
      
