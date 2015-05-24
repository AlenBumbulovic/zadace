package tasks;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //The program checks if the variable is in the 5-5.7 range or
		//in the 7.5-10 range or out of range
		
			double a = 4.8;
		   if (a>=5 && a<=7.5){
			   System.out.println("Variable a is in the range 5-7.5");   
		   }else if (a>=7.5 && a<=10){
			   System.out.println("Variable a is in the range 7.5-10");
		   }else if (a<5 || a>10){
			   System.out.println("Variable a is out of range");
		   }
		}
	
}


