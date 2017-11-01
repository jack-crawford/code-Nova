public class MultiDieDriver {

   public static void main (String[] args) {
   
      MultiDie dice = new MultiDie(20);
      System.out.println(dice);
      dice.roll();
      System.out.println(dice);
      dice.setFaceValue(3);
      System.out.println(dice);
      System.out.println();
      
      MultiDie dice2 = new MultiDie(10);
      System.out.println(dice2);
      dice2.roll();
      System.out.println(dice2);
      dice2.setFaceValue(11);
      System.out.println(dice2);
      System.out.println();

      
      
   }
}