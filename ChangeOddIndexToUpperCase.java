package week3.assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] ca = test.toCharArray();
		String output="";
		for (int i=0;i<test.length();i++ ){
			if(i%2==1) {
			 output+=Character.toUpperCase(ca[i]);
				
			}
			else {
				output+=Character.toLowerCase(ca[i]);
			}
			
		}
		System.out.println(output);
	}

}

