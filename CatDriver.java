public class CatDriver {

   public static void main (String[] args) {
   
      Cat kitty = new Cat("Missy");
      System.out.println(kitty);
      kitty.kill();
      kitty.nudge();
      System.out.println(kitty);
      
      System.out.println();
      
      Cat cat2 = new Cat("Garfield");
      System.out.println(cat2);
      cat2.superKill();      
      System.out.println(cat2);

   }
}