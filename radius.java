//radius.java 
import java.util.Scanner;
import java.text.DecimalFormat;
public class radius
{
   public static void main (String[] args)
   {
      double radius;
      double diameter;
      Scanner prompt = new Scanner(System.in);
      System.out.print("give the radius of a circle >> ");
      radius = prompt.nextDouble();
      System.out.println();
      diameter = 2 * radius;
      DecimalFormat two_places = new DecimalFormat("#.##");
      String circ = two_places.format(2 * radius * Math.PI);
      System.out.println("radius: " + radius + ", diameter: " + diameter + ", circumference: " + circ); 

   }
   
}