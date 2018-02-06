public class SphereDriver {

   public static void main (String[] args) {
   
      Sphere round = new Sphere();
      
      round.setDiameter(10);
      System.out.println(round.getDiameter());
      System.out.println(round.getSurfaceArea());
      System.out.println(round);
      
      round.setDiameter(20);
      System.out.println(round.getDiameter());
      System.out.println(round.getSurfaceArea());
      System.out.println(round);

   }
}