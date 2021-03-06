package day18;

public class Pascal {

	public static void main(String[] args) {
		int number=5;
		int temp=1;
	int space=(number);
		for (int i = 0; i <=number; i++) {
			for (int j = 1; j<=space; j++) {
				System.out.print(" ");
			}
			temp=1;
			for (int j =0; j<=i; j++) {
				System.out.print(temp+" ");
			temp=temp*(i-j)/(j+1);
			
			}
			space--;
			System.out.println();
		}

	}

}
