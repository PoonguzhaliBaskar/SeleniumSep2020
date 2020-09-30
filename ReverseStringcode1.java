package week3.assignment;

public class ReverseStringcode1 {

	public static void main(String[] args) {
		String test = "feeling good";
		char[] charArray =new StringBuilder(test).reverse().toString().toCharArray();
		for (char c : (charArray)) {
			System.out.print(c);
			
		}
	}

}
