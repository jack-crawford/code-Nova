import java.util.Random;

public class lotsOfRandom {

   public static void main (String[] args) {
      Random randd = new Random();

      final int RANDS = 20;
      final int RANGE = 6;
      final int LOWERBOUND = 5;
      
      int[] percents = new int[LOWERBOUND + RANGE];
      
      for (int i=0; i<(LOWERBOUND + RANGE); i++) {
         percents[i] = 0;
      }
      
      for(int i=0; i<RANDS; i++) {
         int random = randd.nextInt(RANGE) + 5;
         percents[random] ++;
      }
      
      for(int i=LOWERBOUND; i<(LOWERBOUND+RANGE); i++) {
         double perc = (double) percents[i] / RANDS;
         perc = perc * 100;
         System.out.println(i + ": " + perc + "%"); 
      }

   }
}
