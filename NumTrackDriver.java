public class NumTrackDriver {

   public static void main (String[] args) {
   
      NumTrack nums = new NumTrack("Nums");
      nums.add(32);
      System.out.println(nums);
      nums.add(4002);
      System.out.println(nums);
      System.out.println("the avg is: " + nums.getAvg());

      System.out.println();
      
      NumTrack nums2 = new NumTrack("Two nums");
      nums2.add(3222);
      System.out.println(nums2);
      nums2.add(1);
      System.out.println(nums2);
      System.out.println("the avg is: " + nums2.getAvg());
      System.out.println();

      
      
   }
}