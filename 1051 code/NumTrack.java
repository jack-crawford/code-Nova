
public class NumTrack {

   private int sum = 0, count = 0; 
   private String name;
   public NumTrack(String name) {
      this.name = name;
   }
   
   public void add(int adder) {
      sum += adder;
      count = count + 1;
   }
   public double getAvg() {
      if (count > 0)
         return sum/count;
      else 
         return 0.0;
   }
   
   public int getCount() {
      return count;
   }

   public String toString() {
      return name + " has a sum of " + sum + " and a count of " + count + " and an avg of " + getAvg();
   }
}