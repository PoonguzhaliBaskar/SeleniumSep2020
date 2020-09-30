package week3.assignment;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
			
		char[] charArray = test.toCharArray();
		int letter=0;
		int space=0;
		int num=0;
		int specialChar=0;
		
		
    for (char c : charArray) {
    	if(Character.isLetter(c)) {
    		letter++;
    	}
    	if(Character.isDigit(c))
    		{
    		num++;
    		}
    	if(Character.isSpaceChar(c)) {
    		space++;
    		}
    	else{
    		specialChar++;
    	}
    }
    System.out.println(test);
    	System.out.println("letter: " + letter);
		System.out.println("number: " + num);
		System.out.println("space: " + space);
  		System.out.println("specialCharcter: " +specialChar);
    	}
    
	}
    	
    