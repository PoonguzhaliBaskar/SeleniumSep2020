package day18;

import java.util.Arrays;
import java.util.List;

public class Removevowels {

	public static void main(String[] args) {
		Character comp[]= {'a','e','i','o','u','A','E','I','O','U'};
		List<Character> list=Arrays.asList(comp);
		String input="I am A Software Engineer";
   StringBuffer sb=new StringBuffer(input);
   for (int i = 0; i < sb.length(); i++) {
	   if(list.contains(sb.charAt(i))){
		   sb.replace(i,i+1, "");
			System.out.println(sb);
}				
			}
System.out.println(sb.toString());		
	}

}
