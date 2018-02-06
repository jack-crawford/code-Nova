//Book.java by jack crawford
//reading pages 

public class Book {

    public static void main (String[] args) {
    
      int totalPages = 393;
      int pagesSixDays = totalPages / 7;
      int pagesLastDay = (totalPages % 7) + pagesSixDays;
      
      System.out.println("Pages read for the first 6 days: " + pagesSixDays);
      System.out.println("Pages read on the seventh day: " + pagesLastDay);

    }
}