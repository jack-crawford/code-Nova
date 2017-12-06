package Histogram;
public class ReadingLevelHistogram implements HistogramInterface {

   int num_of_rows;
   int total;
   int longer_than_15;
   int[] row_size_count;
   
   public ReadingLevelHistogram(int rows) {
      num_of_rows = rows;
      row_size_count = new int[15];
   }
   
   public void submit(int row_num) {
      //System.out.println(row_num);
      if (row_num > 15) 
         longer_than_15 ++;   
      else {
         row_size_count[row_num - 1] = row_size_count[row_num - 1] + 1;
         
      }
      total ++;
   }
   int largest = 1;

   public String toString() {
      String to_return = "";
      for(int i=0; i<num_of_rows; i++)
         if (row_size_count[i] > largest)
            largest = row_size_count[i];
      
      int weight = (int) ((largest - 1)/30);

      to_return += "* = " + weight + "\n";
      for(int i=0; i<num_of_rows; i++){
         
         to_return +=i+1+":"; 
         
         for (int j=(row_size_count[i])/(weight); j>0; j--) 
            to_return+="*";
            
         to_return+="\n";
        
      }
      to_return += ">15: " + longer_than_15 + "\n" + "total words: " + total;
      return to_return;
   }
   

}