import java.util.Random;

public class diceArrays {

   public static void main (String[] args) {
      MultiDie d1 = new MultiDie(6);
      MultiDie d2 = new MultiDie(6);
      
      
      final int NUMBEROFROLLS = 1000000;
      int[] percents = new int[13];
      
      for (int i=0; i<12; i++) {
         percents[i] = 0;
      }
      
      for(int i=0; i<NUMBEROFROLLS; i++) {
         d1.roll();d2.roll();
         int sums = d1.getFaceValue() + d2.getFaceValue();
         percents[sums] = percents[sums] + 1;
      }
      
      for(int i=2; i<=12; i++) {
         double perc = (double) percents[i] / NUMBEROFROLLS;
         perc = perc * 100;
         System.out.println(i + ": " + perc + "%"); 
      }

   }
}
