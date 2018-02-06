// rectCalc.java   by jack crawford
//takes input creates output

import java.util.Scanner;
public class rectCalc {

   public static void main (String[] args) {
      
      Scanner input = new Scanner(System.in);
      
      String rectName;
      int len, wid, perim, area;
      
      System.out.print("rect name >>");
      rectName = input.next();
      
      System.out.print("rect length >>");
      len = input.nextInt();
      
      System.out.print("rect width >>");
      wid = input.nextInt();
      
      perim = 2*len + 2*wid;
      area = len*wid;
      System.out.println(rectName + " is " + len + " x " + wid);
      System.out.println(rectName + " has a perimeter of " + perim + " and an area of " + area);

      
      
   }
}