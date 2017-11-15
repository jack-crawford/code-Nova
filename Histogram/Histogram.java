package Histogram;
public class Histogram {

   int num_of_rows;
   int[] row_size_count;
   
   public Histogram(int rows) {
      num_of_rows = rows;
      row_size_count = new int[rows];
   }
   
   public void inc_row(int row_num) {
      row_size_count[row_num] = row_size_count[row_num]+ 1;
   }

   public String toString() {
      String to_return = "";
      for(int i=0; i<num_of_rows; i++) {
         to_return += i + ":";         
         for (int j = row_size_count[i]; j>0; j--) 
            to_return += "*";
         to_return += "\n";
      }
      return to_return;
   }
   

}