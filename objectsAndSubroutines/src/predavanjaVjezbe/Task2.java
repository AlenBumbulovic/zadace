package predavanjaVjezbe;

public class Task2 {

	public static int getNumberOfHoles(int a) {
		int counter = 0;
		int div = 0;
		for (int i = a; i > 0; i /= 10) {
			div = i % 10;
			if (div == 4 || div == 6 || div == 9 || div == 0) {
				counter++;
			} else if (div == 8) {
				counter += 2;
			}
		}
		return counter;

	}

	public static void main(String[] args) {
		int counter = getNumberOfHoles(23456);

		System.out.println(counter);

	}

}
