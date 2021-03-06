package day25;


public class Removewhitespace {

	public static void main(String[] args) {
		String str="   Removewhitespace     ";
		String newstr=str.replaceAll("\\s", "");
		System.out.println(newstr);
	}}
