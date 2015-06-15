package tasks;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //A program that checks is it posible to form a triangle
		//with three given values
		
		int a = 1;
		int b = 1;
		int c = 8;
		
		if (a+b<c || a+c<b || b+c<a){
			System.out.println("It's not possible to form a triangle");
		} else { 
			System.out.println("it is possible to form a triangle"); 
		}
		
	}

}
