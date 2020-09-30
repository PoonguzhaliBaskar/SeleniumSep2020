package week3.assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] split = test.split(" ");
		StringBuilder result=new StringBuilder();
	for (int i=0;i<split.length;i++) {
				if(i%2!=0) {
					char[] charArray = split[i].toCharArray();
			
		String reverse="";
		for (int j=charArray.length; j>0; j--)
				 {
					System.out.print(String.valueOf(charArray[j-1]));
				
					 }
				result.append(reverse).append(" ");
				 System.out.print(result.toString());
  }
	}}}
