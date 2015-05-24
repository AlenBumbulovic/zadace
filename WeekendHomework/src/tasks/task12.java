package tasks;

public class task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // The program says if the ball has a good qualitiy or not
		// based on the the volume of the ball
		
		double r = 1.8;
		double volume = (4.0/3.0)*r*r*r*Math.PI;
		double tolerance = 6.014*0.05/100;
		
		if (volume<=6.014-tolerance || volume>=6.014+tolerance){
			System.out.println("The ball has a good quality");
		} else {
			System.out.println("The ball doesnt have a good quality");
		}
	}

}
