// ShoeCost.java by jack crawford
// Calculates money saved by not buying some pairs of shoes

public class ShoeCost {
    
    public static void main (String[] args) {
      int shoeCost = 28;
      int wantedShoes = 15;
      int purchasedShoes = 3;
      int possibleCost = shoeCost * wantedShoes;
      int actualCost = shoeCost * purchasedShoes;
      int moneySaved = possibleCost - actualCost;
      
      System.out.println("Dollar amount that could've been spent: $" + possibleCost);
      System.out.println("Dollar amount that was spent: $" + actualCost);
      System.out.println("Money saved: $" + moneySaved);
    }
}