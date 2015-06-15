package predavanjaVjezbe;
import java.util.Scanner;
public class Vjezbe {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String name;
		System.out.println("Unesite ime");
		name = in.next();
		int a = 0;
		a = name.length();
		
		for (int i = 0; i < a; i++){
			System.out.println(name.charAt(i));
		}
		
	}

}
