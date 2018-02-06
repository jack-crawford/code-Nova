public class TimeTrack {

   private int secondsGoneBy = 0; 
   private String name;
   public TimeTrack(String name) {
      this.name = name;
   }
   public int getTotalSeconds() {
      return secondsGoneBy;
   }
   public void addSeconds(int seconds) {
      secondsGoneBy += seconds;
   }
   public void addMinutes(int minutes) {
      secondsGoneBy += minutes * 60;
   }
   public void addHours(int hours) {
      secondsGoneBy += hours * 60 * 60;
   }
   public void addDays(int days) {
      secondsGoneBy += days * 60 * 60 * 24;
   }
   
   public String toString() {
      int seconds = secondsGoneBy % 60;
      int minutes = (secondsGoneBy / 60) % 60;
      int hours = (secondsGoneBy / 3600) % 24;
      int days = secondsGoneBy / (3600 * 24);
      return name + ":\n\tdays: " + days + "\n\thours: " + hours + "\n\tminutes: " + minutes + "\n\tseconds: " + seconds;
   }
}