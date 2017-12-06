package Histogram;
import Histogram.Histogram03;
import java.util.Random;
public class Histogram03Driver {

   public static void main (String[] args) throws HistogramOutOfBoundsException{
      int GRAM_SIZE = 10;
      
      HistogramInterface gram = new Histogram03(GRAM_SIZE);
      Random rand = new Random();
      for(int i = 1; i<(GRAM_SIZE * 10); i++) {
         gram.submit(rand.nextInt(GRAM_SIZE));
      }
      System.out.println(gram);
   }
}