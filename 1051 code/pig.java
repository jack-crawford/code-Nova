  //pig.java 
  import java.util.Scanner;
  import java.util.Random;
  public class pig
  {
     public static void main (String[] args)
     {
      Random dices = new Random();
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to PIG, the most \"fun\" \"game\" in the world!");
      System.out.println("––––––––––––––––––––––––––––––––––––––––––––––––––––––––");
      
      int dice_1, dice_2, together, round_count = 1, total_points = 0, round_points = 0;
      boolean round_active = true;
      boolean continue_game = true;
      boolean automation = false;
      int continue_or_nah = 0;
      //user play stuff
      //System.out.print("Automate the game or play yourself? (enter 1 for automation) > ");
      //if (input.nextInt() == 1) {
      //   automation = true;
      //}
      
      //input.nextLine();
      
      //monte carlo stuff
      //uncomment to try
      automation = true;
      int monte_count = 0;
      double avg_rounds = 0.0;
      while (monte_count <= 1000) {
         round_count = 1;
         while (continue_game) {
            System.out.println("\nRound " + round_count + ":");
            while (round_active) {
               
               dice_1 = dices.nextInt(5) + 1;
               dice_2 = dices.nextInt(5) + 1;
               together = dice_1 + dice_2;
               if (together == 2) {
                  round_active = false;
                  round_points = 0;
                  total_points = 0;
                  System.out.println("You rolled snake eyes, your score is now 0. Sorry!");
               } else {
                  if (dice_1 == 1 || dice_2 == 1) {
                     round_points = 0;
                     round_active = false;
                     System.out.println("On round " + round_count + ", you rolled a one, reset round");
                  } else {
                     round_points = round_points + together;               
                     System.out.println("You rolled a " + together);
                     System.out.println("Round points: " + round_points);
                     System.out.println("Total points: " + total_points);
                     if (!automation) {
                        System.out.print("Keep going? (Hit 1 to end the round, anything else to continue.) > ");
                        continue_or_nah = input.nextInt();
                        input.nextLine();
                     } else {
                         if (round_points >= 16) {
                             continue_or_nah = 1;
                         } else {
                             continue_or_nah = 0;
                         }
                     }
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
               monte_count ++;
               total_points = 0;
               avg_rounds += round_count;
            } else {
              round_active = true;
              round_count ++;
            }
         }
         round_count = 1;
         continue_game = true;
      }
      avg_rounds = avg_rounds / 1000.0;
      System.out.println(avg_rounds);
   }
}
