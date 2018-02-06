//stars.java   by jack crawford

public class stars {

   public static void main (String[] args) {
      
      
      int num_of_stars = 5;
      int stars_printed = 5;
      
      while (num_of_stars > 0) {
         stars_printed = num_of_stars;
         while (stars_printed > 0) {
            System.out.print("*");
            stars_printed = stars_printed - 1;
         }
         System.out.println();
         num_of_stars -- ;
      }
   }
}