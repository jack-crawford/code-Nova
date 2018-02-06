import java.util.Scanner;
public class SlotsGame {

   public static void main (String[] args) {
      Scanner input = new Scanner(System.in);
      boolean in_game = true;
      int money, ini_money, bet;
      SlotMachine slots = new SlotMachine();
      
      System.out.println("Welcome to the slot machine game!");
      
      System.out.print("How much money do you have? >");
      money = input.nextInt();
      ini_money = money;
      input.nextLine();
   
      while(in_game) {
         if (money > 0) {
            System.out.print("How much would you like to bet? (0 to stop) >");
            bet = input.nextInt();
            if (bet != 0) {
               if (bet <= money && bet > 0) {
                  //pull and matches
                  slots.pullLever();
                  if (slots.matches() == 2) 
                     money += bet * 5;
                  else if (slots.matches() == 3)
                     money += bet * 50;
                  else 
                     money = money - bet;
                  System.out.println("Now: " + money);
               } else {
                  System.out.println("that's not valid!");
               }
            } else {
               in_game = false;
            }
         } else {
            in_game = false;
         }
      }
      System.out.println("You finished the game with " + money + ". You started with " + ini_money + ". Congrats?!");
   }
}