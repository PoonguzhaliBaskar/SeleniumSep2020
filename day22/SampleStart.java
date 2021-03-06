package day22;

public class SampleStart {

	public static void main(String[] args) {
		int k=8;
		for (int i = 6; i <=7 ;i++) {
		for (int j = 1; j <=i ; j++) {
		System.out.print("*");

		}
		System.out.println();
		}
		while(k<=12)
		{
		for (int i = 1; i <=3; i++) {
		for (int j = 1; j <=k; j++) {
		System.out.print("*");
		}
		k--;
		System.out.println();
		}
		k=k+5;
		}

	}

}
