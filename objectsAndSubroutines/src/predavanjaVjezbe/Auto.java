package predavanjaVjezbe;

class Auto {
	
	private String name;
	private boolean isDiesel;
	private String color;
	private int productionYear;
	
	public Auto(String n, boolean d, String c, int y) {
		
		name = n;
		isDiesel = d;
		color = c;
		productionYear = y;
	}
	public String toString() {
	String a = "";
	a = a + "Name: " +name+ "\n";
	a = a + "Diesel: " +isDiesel+ "\n";
	a = a + "Color:" + color+ "\n";
	a = a + "Produced in: " + productionYear+ "\n";
	
	return a;
	
	}

}
