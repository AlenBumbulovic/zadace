package tasks;

public class task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Calculates the sum of numbers  of a four digit number
		int a = 4234;
		
		int a1 = (a/1000);
		int a2 = (a%1000)/100;
		int a3 = (a%100)/10;
		int a4 = (a%10);
		
		int sum = a1+a2+a3+a4;
				System.out.println(sum);
	

	}

}
