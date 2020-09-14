package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input=13;
		boolean flag=true;
		for(int i=2;i<input;i++)
{
			if(input%i==0)
			{
				flag= false;
				break;
			}}
		if(flag)
			{
			System.out.println("Given number is a prime number");
			}

	else
	{
		System.out.println("Given number is not a prime number");
	}
}
}
	


