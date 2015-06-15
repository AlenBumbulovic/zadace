package tasks;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //The program prints out wich zodiac sign are you
		//based on the date of your birth
		
		int day = 18;
		int month = 5;
		
		if (month==11 && day>=22 || month==12 && day<=21) {
			System.out.println("Your zodiac sign is 'Sagitarius'");
		
		} else if (month==12 && day>=22 || month==1 && day<=19) {
			System.out.println("Your zodiac sign is 'Capricorn'");
		
		} else if (month==1 && day>19 || month==2 && day<=18) {
			System.out.println("Your zodiac sign is 'Aquarius'");
		
		} else if (month==2 && day>18 || month==3 && day<=20) {
			System.out.println("Your zodiac sign is 'Pisces'");
		
		} else if (month==3 && day>20 || month==4 && day<=19) {
			System.out.println("Your zodiac sign is 'Aries'");
		
		} else if (month==4 && day>19 || month==5 && day<=20) {
			System.out.println("Your zodiac sign is 'Taurus'");
		
		} else if (month==5 && day>20 || month==6 && day<=20) {
			System.out.println("Your zodiac sign is 'Gemini'");
		
		} else if (month==6 && day>20 || month==7 && day<=22) {
			System.out.println("your zodiac sign is 'Cancer'");
		
		} else if (month==7 && day>22 || month==8 && day<=22) {
			System.out.println("Your zodiac sign is 'Leo'");
		
		} else if (month==8 && day>22 || month==9 && day<=22) {
			System.out.println("Your zodiac sign is 'Virgo'");
		
		} else if (month==9 && day>22 || month==10 && day<=22) {
			System.out.println("Your zodiac sign is 'Libra'");
		
		} else if (month==10 && day>22 || month==11 && day<=21) {
			System.out.println("Your zodiac sign is 'Scorpio'");
		} 
		
				
	}

}
