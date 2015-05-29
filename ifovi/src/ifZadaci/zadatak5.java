package ifZadaci;

public class zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5. Checks if your birthday passed or is yet to arrive
   	 
   	   int day = 22;
   	   int month = 5;
   	
   	 
   	   if (day==7 && month ==12){
   		   System.out.println("Today is your birthday");
   	   }else if (day<7 || month<=12){
   		   System.out.println("Your birthday is still to come");
   	   }else if (day>7 || month>12){
   		   System.out.println("your birthday already happened");
   	 }

	}

}
