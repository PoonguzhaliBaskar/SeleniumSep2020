package week3.assignment;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count=1;
		String[] textnew=text.split("\\s+");
		List<String> asList = Arrays.asList(textnew);
		Set<String> textnew1=new LinkedHashSet<String>(asList);
		StringBuilder StringBuilder = new StringBuilder();
		for (String string1 : textnew1) {
			if(count>0) 
				StringBuilder.append(" ");
				StringBuilder.append(string1);
				count++;
			}
			text=StringBuilder.toString();
			System.out.println("String without Duplicates:"+text);
		
	}}
		
		
		
	