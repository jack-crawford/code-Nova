import java.util.Scanner;
public class ints {

   public static void main (String[] args) {
      
      Scanner inputs = new Scanner(System.in);
      System.out.print("How many numbers > ");
      int arraysize = inputs.nextInt();
      System.out.println();
      
      int[] numbers = new int[arraysize];
      int sum = 0;
      for (int i = 0; i < arraysize; i++) {
      
         System.out.print("Enter number > ");
         int num = inputs.nextInt();
         System.out.println();
         sum += num;
         numbers[i] = num;
      }
      int avg = sum / arraysize;
      int avgeq = 0; int avgless = 0; int avggreater = 0;
      for (int i = 0; i < arraysize; i++) {
         if (numbers[i] == avg) 
            avgeq++;
         else if (numbers[i] < avg)
            avgless ++;
         else
            avggreater ++;  
      }

      System.out.println("The average number is: " + avg);
      System.out.println("Equal to average is: " + avgeq);
      System.out.println("Less than avg is: " + avgless);
      System.out.println("Greater than avg is: " + avggreater);


   }
}
