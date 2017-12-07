package Histogram;
public class ReadingLevelHistogram implements HistogramInterface {

   int ROW_COUNT;
   int total;
   int longer_than_rows;
   int[] row_size_count;
    
   public ReadingLevelHistogram(int rows) {
      row_size_count = new int[rows];
      ROW_COUNT = rows;
   }
   
   public void submit(int row_num) {
      if (row_num > ROW_COUNT) 
         longer_than_rows ++;   
      else {
         row_size_count[row_num - 1] = row_size_count[row_num - 1] + 1;
         
      }
      total ++;
   }
   int largest = 1;

   public String toString() {

      String to_return = "";
      for(int i=0; i<ROW_COUNT - 1; i++)
         if (row_size_count[i] > largest)
            largest = row_size_count[i];
      
      int weight = (int) ((largest)/30);
      if (weight == 0)
         weight ++;
      to_return += "* = " + weight + "\n";
      for(int i=0; i<ROW_COUNT-1; i++){
         
         to_return +=i+1+":"; 
         
         for (int j=(row_size_count[i])/(weight); j>0; j--) 
            to_return+="*";
            
         to_return+="\n";
        
      }
      to_return += "> "+ROW_COUNT+": " + longer_than_rows + "\n" + "total words: " + total;
      return to_return;
   }
   

}