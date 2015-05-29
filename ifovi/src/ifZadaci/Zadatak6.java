package ifZadaci;

public class Zadatak6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// checks if its leap year or not
		
		int year = 2012;
		
	    if (year%400==0 && year%100==0 || year%4==0){
	    	System.out.println("It's a leap year");
	    }else
	    	System.out.println("It's not a leap year");

	}

}
