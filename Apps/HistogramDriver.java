import Histogram.Histogram;
import java.util.Random;
public class HistogramDriver {

   public static void main (String[] args) {
      int GRAM_SIZE = 100;
      
      Histogram gram = new Histogram(GRAM_SIZE);
      Random rand = new Random();
      for(int i = 0; i<(GRAM_SIZE * 10); i++) {
         gram.inc_row(rand.nextInt(GRAM_SIZE));
      }
      System.out.println(gram);
   }
}