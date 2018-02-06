public class DawgDriver {

   public static void main (String[] args) {
   
      Dawg brinkley = new Dawg("Brinkley", 5);
      System.out.println("brinkley is " + brinkley.getPersonAge() + " in human years");

      System.out.println(brinkley);
      brinkley.setAge(1000);
      System.out.println(brinkley);
      System.out.println();
      Dawg brinkley2 = new Dawg("dog 2", 23);
      System.out.println("dog 2 is " + brinkley2.getPersonAge() + " in human years");

      System.out.println(brinkley2);
      brinkley2.setAge(1500);
      System.out.println(brinkley2);

   }
}