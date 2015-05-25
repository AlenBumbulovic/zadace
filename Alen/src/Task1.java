
public class Task1 {
	public static void main(String[] orgs){

			//A program that prints how many time a number can be divided
			//until it becomes 0
			
			int number = 342;
			int num = number;
			int counter = 1;
			
			while (num / counter > 0){
				num /= 2;
				counter++;
			}
			System.out.println("The number "+number+" can be divided "+counter+" times");
			
		
		
	}
}
