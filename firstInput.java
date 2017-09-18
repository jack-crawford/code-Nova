// rectCalc.java   by jack crawford
//takes input creates output

import java.util.Scanner;
public class rectCalc {

   public static void main (String[] args) {
      
      Scanner input = new scanner(System.in);
      
      String rectName;
      int len, wid, perim, area;
      
      System.out.println("rect name >>");
      rectName = input.next();
      
      System.out.println("rect length >>");
      len = input.nextInt();
      
      System.out.println("rect width >>");
      wid = input.nextInt();
      
      perim = 2*len + 2*wid;
      area = len*wid;
      print(rectName + " is " + len + " x " + wid);
      
      
      
   }
}