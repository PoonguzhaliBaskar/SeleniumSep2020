package day24;

public class Stringcount2 {

	public static void main(String[] args) {
		String str="Welcome to Chennai";
		int[] count=new int[256];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
			//System.out.println(count[str.charAt(i)]);
		}
		
		for (int i = 0; i < count.length; i++) {
			if(count[i]>0) {
				char ch=(char)i;
				System.out.println("Occurance of "+ ch +" - "+ count[i]);
			}
		}

	}

}
