package predavanjaVjezbe;

public class Metode {
	
	public static void sayHello(String name) {
		System.out.println("Hello " +name);
	}
	public static boolean isPositive(int num) {
		return (num >= 0)? true : false;
	}
	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		}
		
		return false;
	}
	
	public static boolean isPrime(int num){
		for(int i = 2; i <= num; i++){
			if (num % i == 0 && i != num){
			return false;
		}
	}
		return true;
	}
	public static void main(String[] args) {
		
		
		
		System.out.println(isPrime(17));

	}

}
