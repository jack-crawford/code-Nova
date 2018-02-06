//*********************************************************
//  Doodad LabNum01.java       Author: Joyce
//
//  For tracing execrcise
//*********************************************************

public class LabNum01
{
   public static void main (String[] args)
   {
      Doodad first = new Doodad();
      Doodad second = new Doodad();
      
      first.setName ("Harry");
      second.setName ("Sally");
      System.out.println (second.getName());
      
      second.setNumber(first.getName().length());
      first.setNumber(second.getNumber() + 3);
      System.out.println (first.getNumber());
      System.out.println (second.getNumber());
      
      first = second;
      second.setNumber(37);
      System.out.println (first.getName());
      System.out.println (first.getNumber());
      System.out.println (second.getName());
      System.out.println (second.getNumber());
   }
}
