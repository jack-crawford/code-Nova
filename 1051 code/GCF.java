//GCF.java 
import java.util.Scanner;
public class GCF
{
   public static void main (String[] args)
   {
      int first, second, gcf;
      int shared = 1;

      boolean still_goin = true;

      Scanner prompt = new Scanner(System.in);
      System.out.print("give the first >> ");
      first = prompt.nextInt();
      System.out.println();
      
      System.out.print("give the second >> ");
      second = prompt.nextInt();
      System.out.println();
      
      if (second > first) {
         int holdr = first;
         first = second;
         second = holdr;
      }
      
      
      while (first != 0 && second != 0) {
         int x = second;
         second = second % first;
         first = x;
      }
      System.out.println(first + second);
   }
   
}