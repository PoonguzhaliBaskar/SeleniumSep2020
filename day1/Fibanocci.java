package week1.day1;

public class Fibanocci {

	public static void main(String[] args) {
		int range =8;
		int firstNum=0;
		int secNum=1;

		for(range = 1; range<=8; range++)
		{
			System.out.println(firstNum);
	
       int add = firstNum + secNum;
   firstNum =secNum;

   secNum  = add;
 
	}

	}}
