//Time.java by jack crawford
//calculates time since midnight

public class Time {

    public static void main (String[] args) {
    
      int currentHour = 13;
      int currentMinute = 23;
      int currentSecond = 45;
      
      int currentHourInSeconds = currentHour * 60 * 60;
      int currentMinuteInSeconds = currentMinute * 60;
      
      int totalSecondsSinceMidnight = currentHourInSeconds + currentMinuteInSeconds + currentSecond;
      
      System.out.println("Current time: " + currentHour + ":" + currentMinute + ":" + currentSecond);
      System.out.println("Total seconds since midnight: " + totalSecondsSinceMidnight);
        
    }
}