import java.util.Random;
public class SlotMachine {
   Random pull = new Random();

   private int w1 = 1, w2 = 2, w3 = 3; 
   public SlotMachine() {
   }
   
   public void pullLever() {
      w1 = pull.nextInt(10);
      w2 = pull.nextInt(10);
      w3 = pull.nextInt(10);
   }
   public int matches() {
      if (w1 == w2 && w2 == w3) 
         return 3;
      else if ((w1 == w2) || (w1 == w3) || (w2 == w3))
         return 2;
      else 
         return 0;
   }
   
   
   public String toString() {
      return w1 + "  " + w2 + "  " + w3;
   }
}