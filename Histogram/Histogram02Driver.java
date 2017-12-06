package Histogram;
import Histogram.Histogram02;
import java.util.Random;
public class Histogram02Driver {

   public static void main (String[] args) {
      int GRAM_SIZE = 100;
      
      HistogramInterface gram = new Histogram02(GRAM_SIZE);
      Random rand = new Random();
      for(int i = 0; i<(GRAM_SIZE * 10); i++) {
         gram.submit(rand.nextInt(GRAM_SIZE));
      }
      System.out.println(gram);
   }
}