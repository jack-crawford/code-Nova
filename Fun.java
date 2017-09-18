//Fun.java by jack crawford
//fun!

public class Fun {

    public static void main (String[] args) {
      int totalSecondsGoneBy = 30345;
      
      int secondsGoneBy = totalSecondsGoneBy % 60;
      int minutesGoneBy = (totalSecondsGoneBy / 60) % 60;
      int hoursGoneBy = totalSecondsGoneBy / 3600;
      
      System.out.println("Time: " + hoursGoneBy + ":" + minutesGoneBy + ":" + secondsGoneBy);
    }
}