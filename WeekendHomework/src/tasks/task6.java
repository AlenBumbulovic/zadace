package tasks;
 public class task6 {

	public static void main(String[] args) {
		//Converts military time to AM/PM
		double time = 10.00;
		
		if(time <= 12){
			System.out.println("Time is: " + time + " AM");
		} else if(time >= 12) {
			
			if(time == 13) {
				time = 1;
			}
			if(time == 14) {
				time = 2;
			}
			if(time == 15) {
				time = 3;
			}
			if(time == 16) {
				time = 4;
			}
			if(time == 17) {
				time = 5;
			}
			if(time == 18) {
				time = 6;
			}
			if(time == 19) {
				time = 7;
			}
			if(time == 20) {
				time = 8;
			}
			if(time == 21) {
				time = 9;
			}
			if(time == 22) {
				time = 10;
			}
			if(time == 23) {
				time = 11;
			}
			if(time == 24) {
				time = 12;
			}
			System.out.println("time is " + time + " PM");
		}

	}

}
