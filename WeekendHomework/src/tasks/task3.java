package tasks;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Checks wich of the two dates comes first
		
		int day1 = 4;
		int month1 = 7;
		int year1 = 2014;
		int day2 = 5;
		int month2 = 8;
		int year2 = 2014;
		
		if (day1==day2 && month1==month2 && year1==year2) {
		   System.out.println("The dates are the same");
		} else if (year1>year2) {
			System.out.printf("Date: %d.%d.%d comes before the date: %d.%d.%d",
					day2,month2,year2,day1,month1,year1);
		} else if (month1>month2) {
			System.out.printf("Date: %d.%d.%d. comes before the date: %d.%d.%d.",
					day2,month2,year2,day1,month1,year1);
		} else if (day1>day2) {
			System.out.printf("Date: %d.%d.%d. comes before the date: %d.%d.%d.",
					day2,month2,year2,day1,month1,year1);
		} else 
			System.out.printf("Date: %d.%d.%d. comes before the date: %d.%d.%d. ",
					day1,month1,year1,day2,month2,year2);
	}

}
