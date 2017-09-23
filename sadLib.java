// sadLib.java   by jack crawford
//takes input creates output

import java.util.Scanner;
public class sadLib {

   public static void main (String[] args) {
      String var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11;
      Scanner prompt = new Scanner(System.in);
      System.out.print("a name >> ");
      var1 = prompt.next();
      System.out.println();
      
      System.out.print("an adjective >> ");
      var2 = prompt.next();
      System.out.println();

      System.out.print("a profession >> ");
      var3 = prompt.next();
      System.out.println();
      
      System.out.print("another profession >> ");
      var4 = prompt.next();
      System.out.println();

      System.out.print("a place for recreation >> ");
      var5 = prompt.next();
      System.out.println();
      
      System.out.print("a celebrity >> ");
      var6 = prompt.next();
      System.out.println();
      
      System.out.print("a goofy name >> ");
      var7 = prompt.next();
      System.out.println();
      
      System.out.println(var1 + " was feeling " + var2 + " because he was stuck being " + var3 + ", but wanted to be a "+ var4 + ", so naturally, he went to the " + var5 +
                         " to unwind. There, he ran into his old friend "+ var6 + ", or as " + var1 + " knows him, " + var7 + ". ");
   }
   
}
      
