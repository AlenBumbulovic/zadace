package ifZadaci;

public class zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   	 //4. Checks if the number is in range 0-25 or 0-50 or neither
   	 
   	   int a = 77;
   	 
   	   if (a>=0 && a<=25){
   		 System.out.println("a se nalazi u opsegu 0-25");
   	   }else if (a>=25 && a<=50){
   		 System.out.println("a se nalazi u opsegu 25-50");
   	   }else if (a>50){
   		 System.out.println("a je izvan opsega 0-25 i 25/50");
   	 }
	}

}
