import java.util.Scanner;
import java.io.*;
public class ReadingLevel {

   public static void main (String[] args) throws IOException {
      FileReader file = new FileReader("filetoread.txt");
      Scanner reader = new Scanner(file);
      String title = reader.nextLine();
      
      int wordcount = 0; int sentcount = 0; int syllablecount = 0; int lettercount = 0; double easeScore = 0.0; 
      String readingLevel = "?";
      do {
         
         String word = reader.next();
         //the number of syllables equal to the number of letters divided by 3
         wordcount ++;
         
         lettercount += word.length();
         //check for sentence termination
         String lastchar = word.substring(word.length() - 1);
         if (lastchar.equals("!") || lastchar.equals(".") || lastchar.equals("?")) {
            sentcount ++;
         } 
      } while(reader.hasNext());
      
      lettercount = lettercount - sentcount;
      syllablecount = lettercount / 3;
      easeScore = 206.835 - (1.015*( (double) wordcount/sentcount)) - (84.6*( (double) syllablecount/wordcount));
      int easeScoreSimple = (int) easeScore / 10 + 1;
      switch (easeScoreSimple) {
         case 11: readingLevel = "5th Grade or Below";
                           break;
         case 10: readingLevel = "5th Grade";
                           break;
         case 9: readingLevel = "6th Grade";
                           break;
         case 8: readingLevel = "7th Grade";
                           break;
         case 7: readingLevel = "8-9th Grade";
                           break;
         case 6: readingLevel = "10-12th Grade";
                           break;
         case 5: readingLevel = "College";
                           break;
         case 4: readingLevel = "College";
                           break;
         case 3: readingLevel = "College Graduate";
                           break;
         case 2: readingLevel = "College Graduate";
                           break;
         case 1: readingLevel = "College Graduate";
                           break;
      }
      System.out.println(title);
      System.out.println("Words: " + wordcount + "\nSentences: " + sentcount + "\nLetters: " + lettercount);
      System.out.println("Syllables: " + syllablecount + "\nScore: " + easeScore + "\nGrade: " + readingLevel);
      
   }
}
