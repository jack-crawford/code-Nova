package Histogram;
public class Test {
   private int value = 0;
   public Test(int value) {
      this.value = value;
   }
   
   public void inc() {
      value ++;
   }
   public int getNumber() {
      return value;
   }  
   public String toString() {
      return "value : " + value;
   }


}