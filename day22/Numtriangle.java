package day22;

public class Numtriangle {
	public static void main(String[] args) {
		int row=5;
		int temp=1;
		
	
		for (int i=1; i <=row; i++) {
	
		for (int space=0; space <=row-i ; space++) {
     
			System.out.print(" ");
		
	         }

	for (int j = 1; j<=i; j++)
		 {
		 System.out.print(temp+" ");
	temp++;
		}
 System.out.println();
 
		}
		
	
 }	}