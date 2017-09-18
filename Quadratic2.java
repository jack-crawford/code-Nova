import java.util.Scanner;
 
public class Quadratic2
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
   
    double a = 0;
    double b = 0;
    double c = 0;
    double discriminant = 0;
    double d = 0;
   
    System.out.print("Enter the value of a : "); 
    a = input.nextDouble();
 
    System.out.print("Enter the value of b : "); 
    b = input.nextDouble();
 
    System.out.print("Enter the value of c : "); 
    c = input.nextDouble();
   
    discriminant = (b * b - 4 * a * c);
   
    d = Math.sqrt(discriminant);
   
    if (discriminant >= 0.0) {
       System.out.println("First root of the equation : "
                   +(-b + d) / (2.0*a));
        
       System.out.println("Second root of the equation : "
                   +(-b - d) / (2.0*a));
    } 
    else
    {
       System.out.println("The roots are not real numbers.");
    }
  }
} 