package day22;

public class Starpraymid2 {

	public static void main(String[] args) {
		int row=10;
       int even=2;
       int odd=1;
      // int count2=1;
		for (int i=1; i <=row; i++) {
			if((i&1)==0) {
				for (int j = 1; j <=even; j++) {
						 System.out.print("*"+" ");
								
						 if(even+4 ==i &&j==even) {
							 even=even+2;
						 }
						 
					}		
				System.out.println();
						}	 
						//System.out.println("inside even completed ==>" + "even Value  "+even);
			
			else {	
					for (int j = 1; j <=odd; j++) {
						
						 System.out.print("*"+" ");
						 if(odd+4 ==i &&j==odd && ev) {
							 odd=odd+2;
						 }
					
					}
		 System.out.println();
		// System.out.println("inside odd completed ==>"+ "Odd Value  "+odd);
		 
			}
			//System.out.println("Set completed ==>" + i);
			}
	

		
	}
}

		
	
 