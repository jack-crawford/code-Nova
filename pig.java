//pig.java 
import java.util.Scanner;
import java.util.Random;
public class pig
{
   public static void main (String[] args)
   {
      Random dices = new Random();
      Scanner input = new Scanner(System.in);

      int dice_1, dice_2, together, round_count = 1, total_points = 0, round_points = 0;
      boolean round_active = true;
      boolean continue_game = true;
      int continue_or_nah = 0;
      while (continue_game) {
         System.out.println("Round " + round_count + ":");

         while (round_active) {
            dice_1 = dices.nextInt(5) + 1;
            dice_2 = dices.nextInt(5) + 1;
            together = dice_1 + dice_2;

            if (together == 2) {
               round_active = false;
               round_points = 0;
               total_points = 0;
               System.out.println("On round " + round_count + ", you rolled snake eyes, reset score");

            } else {
               if (dice_1 == 1 || dice_2 == 1) {
                  round_points = 0;
                  round_active = false;
                  System.out.println("On round " + round_count + ", you rolled a one, reset round");

               } else {
                  round_points = round_points + together;               
                  System.out.println("You rolled a " + together);
                  System.out.println(round_points + " = round points");
                  System.out.println(total_points + " = total points");
                  System.out.println("Cont.? (1 = stop, anything else, cont.) > ");
                  continue_or_nah = input.nextInt();
                  input.nextLine();
                  if (continue_or_nah == 1) {
                     total_points = total_points + round_points;
                     round_points = 0;
                     round_active = false;
                  } else {
                     round_active = true;
                  }

               }
            }
         }
         if (total_points >= 100) {
            continue_game = false;
            System.out.println("You win! Total score: " + total_points);
            System.out.println("Total rounds: " + round_count);
         }
         round_active = true;
         round_count ++;

      }
   }
}