package week3.assignment;

public class Palindrome {

	public static void main(String[] args) {
		String one="Madam";
		String rev="";
		int length=one.length();
		
			for(int j=length-1;j>=0;j--) {
				rev=rev+one.charAt(j);
			}
			if(one.equalsIgnoreCase(rev)) {
				System.out.println("It is a Pallidrome:"+rev);
				
			}
			else {
				System.out.println("Not a Pallindrome");
			}
		}}
	

