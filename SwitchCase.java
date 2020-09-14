package week1.day2;

public class SwitchCase {

	public static void main(String[] args) {
		int a=5;
		int b=6;
		String input="add";
					
		switch (input)
		{
		case "add":
					int result=a+b;
					System.out.println(result);
			
					break;
			
		case "sub":
			int sub=a-b;
			System.out.println(sub);
			break;
		
		case "mul":
			int mul=a*b;
			System.out.println(mul);
			break;
			
		case "div":
			int div=a/ b;
			System.out.println(div);
			break;
	
	}

	}}

