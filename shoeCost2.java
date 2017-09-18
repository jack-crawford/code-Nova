// shoeCost2.java   by jack crawford
//takes input creates output

import java.util.Scanner;
public class shoeCost2 {

   public static void main (String[] args) {
      
      Scanner input = new Scanner(System.in);
      int cost, wantBuy, didBuy, wantPrice, didPrice, saved;
      
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
      System.out.println("Hey, you've saved $" + saved);
   }
}
      
