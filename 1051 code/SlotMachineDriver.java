public class SlotMachineDriver {

   public static void main (String[] args) {
   
      SlotMachine slots = new SlotMachine();
      System.out.println(slots);
      slots.pullLever();
      System.out.println(slots);
      System.out.println(slots.matches());
      
      System.out.println();

      SlotMachine slots2 = new SlotMachine();
      System.out.println(slots2);
      slots2.pullLever();
      System.out.println(slots2);
      System.out.println(slots2.matches());
      slots2.pullLever();
      System.out.println(slots2);
      System.out.println(slots2.matches());
      slots2.pullLever();
      System.out.println(slots2);
      System.out.println(slots2.matches());


      
   }
}