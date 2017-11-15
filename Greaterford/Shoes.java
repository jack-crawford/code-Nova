//
// Shoes.java
//
// Prints out
// 
public class Shoes 
{
      public static void main (String[] args) 
      {
      
         int cost = 25;
         int wants = 15;
         int buys = 3;
         double saved;
         double Lowcost;
         double highcost;
         Lowcost = (double) cost * buys; 
         highcost = (double) cost * wants;
         saved = (double) highcost - Lowcost;
         System.out.println("Amount saved: " + saved);
         
      }
}