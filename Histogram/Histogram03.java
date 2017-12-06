package Histogram;
public class Histogram03 implements HistogramInterface {

   int num_of_rows;
   int total;
   int[] row_size_count;
   
   public Histogram03(int rows) {
      num_of_rows = rows;
      row_size_count = new int[rows];
   }
   
   public void submit(int row_num) throws HistogramOutOfBoundsException {
      if (row_num < 0) 
         throw new HistogramOutOfBoundsException(row_num + " is too small");
      if (row_num > row_size_count.length)
         throw new HistogramOutOfBoundsException(row_num + " is too big");
      
      row_size_count[row_num] = row_size_count[row_num] + 1;

      total ++;
   }

   public String toString() {
      String to_return = "";
      for(int i=0; i<num_of_rows; i++){
         to_return +=i+1+":";         
         for (int j=row_size_count[i]; j>1; j--) 
            to_return+="*";
         to_return+="\n";
      }
      return to_return;
   }
   

}