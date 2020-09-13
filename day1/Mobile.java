package week1.day1;

public class Mobile {
	
	Long mobNumber = 9823432434L;
	String mobColor="Red";
	Double mobWEight=23.23;
	Boolean isREfurbised=true;
			
public void makeCall() 
{
	System.out.println("Making a call");
}

public void sendMessage() 
{
	System.out.println("Sending Message");

}

public void takePhoto() 
{
	System.out.println("Taking Photo");
}
	public static void main(String[] args) {
		Mobile mobobj = new Mobile();
		mobobj.makeCall();
		mobobj.sendMessage();
		mobobj.takePhoto();
		
		Long Number= mobobj.mobNumber;
		System.out.println("Number is "+ Number);
				
		String Color=mobobj.mobColor;
		System.out.println("Color is "+ Color);
		
		Double Weight= mobobj.mobWEight;
		System.out.println("WEight is "+ Weight);

		Boolean Refurbised=mobobj.isREfurbised;
		System.out.println("Refurbised is "+ Refurbised);

	}
	
	
	

	
}
