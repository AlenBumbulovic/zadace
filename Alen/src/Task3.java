
public class Task3 {

	public static void main(String[] args) {
		// Checks if a number is perfect or not
		
		int number = 25;
		int num = number;
		int counter = 0;
		int sum = 0;
		
		while (counter < num / 2){
			counter++;
			
			if (num %  counter ==0){
				sum += counter;
			}
		}

      if (number == sum){
		System.out.println("The number "+number+" is a perfect number");
	}else{
		System.out.println("The number "+number+" is not a perfect number");
	}
		
	
	}

}
