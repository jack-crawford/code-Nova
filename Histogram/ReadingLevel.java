package Histogram;
import Histogram.ReadingLevelHistogram;
import java.util.Scanner;
import java.io.*;
public class ReadingLevel {

   public static void main (String[] args) throws IOException {
      Scanner fileName = new Scanner(System.in);
      System.out.print("file name >>");
      String fileNameString = fileName.nextLine();

      FileReader file = new FileReader(fileNameString);
      Scanner reader = new Scanner(file);
      String title = reader.nextLine();
      String body = "";
      HistogramInterface wordCount = new ReadingLevelHistogram(15);
      while(reader.hasNext()) 
         body += reader.next() + " ";
      
      body = body.replace(","," ");
      body = body.replace(".","");
      body = body.replace("("," ");
      body = body.replace(")"," ");
      body = body.replace("-"," ");
      body = body.replace("\""," ");
      body = body.replace("\'"," ");
      body = body.replace(":"," ");
      body = body.replace(";"," ");
      body = body.replace("?"," ");
      body =  body.replace("!"," ");
      body =  body.replace("/", " ");
      
      String[] words = body.split(" ");
      for(int i=0; i<words.length; i++) 
         if (words[i].length() != 0) 
            wordCount.submit(words[i].length());
         
       
       System.out.println("title: " + title);
       System.out.println(wordCount);
       
   }
}
