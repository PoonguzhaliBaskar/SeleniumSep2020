package week3.assignment;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count=0;
		
		char c='e';
		char[] charArray = str.toCharArray();
		int length=charArray.length;
		System.out.println("Array Length:"+ length);
		for(int i=0;i<length;i++) {
		if(charArray[i]==c) {
			
			count++;
		}
		}
		System.out.println("Occurance Count is:"+count);
			
	}

}
