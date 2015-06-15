
public class Task2 {
	public static void main(String[] args){
		// Prints out the sum of all even numbers from 0 to 'n'
		
		int number = 20;
		int num = number;
		int counter = 0;
		int sum = 0;
		
		while (counter < num){
			counter += 2;
		
			if(counter < num){
				sum += counter;
			}
		
		}
		if (number % 2 ==0){
			System.out.println("The sum of all even numbers from 0 to "+number+" is "+sum+" not including "+number+" ." );
		}

		
		
		
		
	}

}
