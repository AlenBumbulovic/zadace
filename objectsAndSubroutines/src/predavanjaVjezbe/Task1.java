package predavanjaVjezbe;



public class Task1 {
	
   public static int getSum(int a, int b, int c){
	   int sum = 0;
	   for (int i = 0; i <= a; i ++){
		   sum += i;
	   }
	   for (int i = 0; i <= b; i++){
		   sum += i;
	   }
	   for (int i = 0; i <= c; i++) {
		   sum += i;
	   }
	   return sum;
   }
	
   
   
   
   public static void main(String[] args) {
		
		System.out.println(getSum(4,5,6));
			
		

	}

}
