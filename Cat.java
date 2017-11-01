public class Cat {
   private String name;
   private int lives = 9; 
   private boolean sleep = true;
   public Cat(String name) {
      this.name = name;
   }
   
   public int getLives() {
      return lives;
   }
   public void kill() {
      if (lives != 0)
         lives = lives - 1;
   }
   public void superKill() {
      lives = 0;
   }
   public void nudge() {
      sleep = !sleep;   
   }
   public String toString() {
      if (lives != 0) 
         if (sleep)
            return name + " has " + lives + " lives and is asleep";
         else 
            return name + " has " + lives + " lives and is awake";
      } else {
         return name + " is dead...";
      }
   }
}