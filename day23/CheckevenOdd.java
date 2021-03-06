package day23;

public class CheckevenOdd {

	public static void main(String[] args) {
		int number=256;
		if((number&1)==0) {
			System.out.println("even "+number);
		}
			else {
				System.out.println("odd:" +number);
		}

	}

}
