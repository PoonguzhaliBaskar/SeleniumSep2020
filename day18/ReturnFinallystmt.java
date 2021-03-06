package day18;

public class ReturnFinallystmt {

	public static void main(String[] args) {
		System.out.println(exec());
	}
		
	@SuppressWarnings("finally")
	public static int exec() {	
		int[] arr=new int[3];
		try {
			arr[2]=6;
			System.out.println("try block");
			return arr[2];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
     finally {
    	 arr[1]=8;
    	 System.out.println("Finally block executed:"+arr[1]);
    	 return arr[1];
     }
	
	}
}
