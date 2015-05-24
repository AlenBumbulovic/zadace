
public class AlenVjezbe1 {
	public static void main(String[] args){
		//provjerava da li je broj djeljiv sa 3 i 5
		int a = 90;
		
		if (a%3==0 && a%5==0){
			System.out.println("Fizz Buzz");
		}else if (a%5==0){
		    System.out.println("Buzz");
		}else if (a%3==0){
			System.out.println("Fizz");
		}else if(a%3!=0 && a%5!=0){
			System.out.println(a);
		}
		
		
		
	}

}
