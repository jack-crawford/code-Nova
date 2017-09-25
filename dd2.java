//dd2.java 


public class dd2
{
   public static void main (String[] args)
   {
      Doodad christmas = new Doodad();
      christmas.setName("Holly");
      christmas.setNumber(25);
      christmas.setColor("Christmas Green");
      christmas.setIcecream(true);
      christmas.setInjured(false);
      //System.out.println(christmas);
      System.out.println("Holly, do you like Christmas?");
      System.out.println(christmas.answer("Holly, do you like Christmas?"));

   }
}