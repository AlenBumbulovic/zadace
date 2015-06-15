package tasks;

public class task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Calculate if the number is divisibile by the sum of his digits
		
		int a = 541;
		
		int a1 = a / 100;
		int a2 = (a % 100) / 10;
		int a3 = a % 10;
		
		int sum = a1 + a2 + a3;
		
		if (a%sum==0){
			System.out.println("The number is divisible");
		} else {
			System.out.println("The number is not divisible");
			
		}
	}

}
