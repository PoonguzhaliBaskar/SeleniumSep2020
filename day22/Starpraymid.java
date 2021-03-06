package day22;

public class Starpraymid {

	public static void main(String[] args) {
		int row=10;
       int even=2;
       int odd=1;
       int count2=1;
		for (int i=1; i <=row; i++) {
			if((i&1)==0) {
				for (int j = 1; j <=even; j++) {
					 if((count2&i)==0) {
						
						// System.out.println("even"+even);
						
						 System.out.print("*"+" ");
								 //
						 break;
							 }		
					 System.out.print("*"+" ");
					 count2++;
		
						}	 System.out.println();
						//System.out.println("inside even completed ==>" + "even Value  "+even);
			}
			else {	
					for (int j = 1; j <=odd; j++) {
						
						 System.out.print("*"+" ");
//						 if(odd ==i) {
//							 odd=odd+1;
//							 break;
//						 }
					
					}
		 System.out.println();
		// System.out.println("inside odd completed ==>"+ "Odd Value  "+odd);
		 
			}
			//System.out.println("Set completed ==>" + i);
			}
	

		
	}
}

		
	
 