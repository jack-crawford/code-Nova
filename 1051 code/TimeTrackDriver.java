public class TimeTrackDriver {

   public static void main (String[] args) {
      TimeTrack workout = new TimeTrack("workout");
      System.out.println(workout);      
      workout.addDays(3);
      workout.addMinutes(180);
      workout.addHours(3);
      workout.addSeconds(45);
      System.out.println(workout);
      
      
      TimeTrack workout2 = new TimeTrack("workout2");
      System.out.println(workout2);      
      workout2.addDays(3);
      workout2.addMinutes(1);
      workout2.addHours(2);
      workout2.addSeconds(450);
      System.out.println(workout2);

   }
}