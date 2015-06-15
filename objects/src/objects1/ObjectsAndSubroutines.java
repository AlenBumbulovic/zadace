package objects1;

/**
 * vjezbanje objekata u javi
 * @author alen.bumbulovic
 *
 */


public class ObjectsAndSubroutines {

	public static void main(String[] args) {
		
		Planeta pl = new Planeta(1000, 600, "Lopta", "Pluton");
		pl.dodajMasu(80);
		pl.dodajMasu(64);
		pl.racunajTezinu();
		System.out.println("PL Tezina: " +pl.racunajTezinu());
		System.out.println("PL: " +pl.vrijednostMase());
		
		
		Planeta bl = new Planeta(435, 444, "Kocka", "Kockasia");
		bl.dodajMasu(-500);
		System.out.println("BL Tezina: " +bl.racunajTezinu());
		System.out.println("BL: " +bl.vrijednostMase());
	}

}
