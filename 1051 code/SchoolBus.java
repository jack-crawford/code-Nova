import java.util.Scanner;
public class SchoolBus {

   public static void main (String[] args) {
      Scanner input = new Scanner(System.in);
      boolean atSchool = false;
      int kidsToAdd;
      NumTrack bus = new NumTrack("This bus");
      
      System.out.println(bus);
      System.out.println();
      
      while(!atSchool) {
         System.out.print("How many kids at this stop? Or 0 to end >");
         kidsToAdd = input.nextInt();
         input.nextLine();
         if (kidsToAdd != 0) 
            bus.add(kidsToAdd);
         else 
            atSchool = true;
      }
      System.out.println(bus);
      System.out.println("Average kids per stop: " + bus.getAvg());
      
   }
}