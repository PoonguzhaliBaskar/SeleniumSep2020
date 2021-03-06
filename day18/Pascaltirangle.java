package day18;

public class Pascaltirangle {

	public static void main(String[] args) {
		int n=8;
		

	/*	for (int i = 0;  i<=n; i++) {
			
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
				
			}
            System.out.println("");


		}
	}*/
		
		int odd=1;
		int spaces=n-1;
		for (int i = 1; i <=n; i++) {
			{
		int k=0;
		for (int j = 1; j <=spaces; j++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=odd; j++) {
			if(j<=i) {
				k=k+1;
			}
			else {k=k-1;
		}
			System.out.print(k);
		}
			System.out.println();
			odd=odd+2;
			spaces=spaces-1;
		
}}}}