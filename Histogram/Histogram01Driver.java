package Histogram;
import Histogram.Histogram01;
import java.util.Random;
public class Histogram01Driver {

   public static void main (String[] args) throws HistogramOutOfBoundsException{
            
      HistogramInterface gram = new Histogram01(10);
      gram.submit(10);
      System.out.println(gram);
      
   }
}