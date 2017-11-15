import Histogram.Test;

public class TestDriver {
   
   public static void main (String[] args) {
      Test test = new Test(5);
      test.inc();
      System.out.println(test.getNumber());
   }
}