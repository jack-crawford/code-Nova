import java.util.Random;

public class MultiDie {
   Random dices = new Random();

   private int sides; 
   private int faceVal = 1;
   public MultiDie(int sides) {
      this.sides = sides;
   }
   
   public int getFaceValue() {
      return faceVal;
   }
   public void setFaceValue(int faceVal) {
      if (faceVal <= sides)
         this.faceVal = faceVal;
      else 
         this.faceVal = sides;
   }
   
   public void roll() {
      faceVal = dices.nextInt(sides) + 1;
   }

   public String toString() {
      return "the die has " + sides + " sides and the face value is " + faceVal;
   }
}