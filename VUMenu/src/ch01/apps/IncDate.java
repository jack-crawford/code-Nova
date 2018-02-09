package ch01.apps;//dates;
//by jack crawford
public class IncDate extends Date
{

  public IncDate(int newMonth, int newDay, int newYear)
  {
    super(newMonth, newDay, newYear);
  }

  public void increment()
  // Increments this IncDate to represent the next day.
  {
	  
    // increment algorithm goes here
	//if day is last of month
	//day = 1, month increments
	//if month is last month,
	 //day and month go to 1, year increments
	  boolean ly = false;
	  if(((year % 4 == 0) && year % 100 != 0) || year % 400 == 0) {
		  //leap year
		  ly = true;
	  }
	  if ((month == 2 && day == 28 && !ly) || (month == 2 && day == 29 && ly)) {
		  month = 3;
		  day = 1;
	  } else if (month == 2 && day == 28 && !ly) {
		  day ++;
	  } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30){
		  month ++;
		  day = 1;
	  } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 31){
		  System.out.println("month is " + month);
		  month ++;
		  day = 1;
	  } else if ((month == 12) && day == 31) {
		  year ++;
		  month = 1;
		  day = 1;
	  } else {
		  day ++;
	  }
  }
}
 