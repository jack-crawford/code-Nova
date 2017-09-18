// timeInput.java   by jack crawford
//takes input creates output

import java.util.Scanner;
public class timeInput {

   public static void main (String[] args) {
      Scanner promptInput = new Scanner(System.in);
      
      int totalSeconds, hours, minutes, seconds;
      
      System.out.print("how many seconds? >> ");
      totalSeconds = promptInput.nextInt();
      promptInput.nextLine();
      
      
      seconds = totalSeconds % 60;
      minutes = (totalSeconds / 60) % 60;
      hours = totalSeconds / 3600;
      
      System.out.println("Hours: " + hours);
      System.out.println("Minutes: " + minutes);
      System.out.println("Seconds: " + seconds);

   }     
}