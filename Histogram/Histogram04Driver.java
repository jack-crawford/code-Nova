package Histogram;
import Histogram.Histogram04;
import java.util.Random;
public class Histogram04Driver {

   public static void main (String[] args) throws HistogramOutOfBoundsException{
      int GRAM_SIZE = 10;
      
      HistogramInterface gram = new Histogram04(GRAM_SIZE);
      Random rand = new Random();
      for(int i = 1; i<(GRAM_SIZE * 10000); i++) {
         gram.submit(rand.nextInt(GRAM_SIZE));
      }
      System.out.println(gram);
      
      
      Histogram04 gram2 = new Histogram04(GRAM_SIZE);
      for(int i = 1; i<(GRAM_SIZE * 100); i++) {
         gram2.submit(rand.nextInt(GRAM_SIZE));
      }
      System.out.println(gram2);

   }
}