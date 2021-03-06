package day26;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		String str="This a text message";
		String str2 = str.toLowerCase();
		int vcount = 0;
		int ccount=0;
		for (int i = 0; i < str2.length(); i++) {
		char c = str2.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			vcount++;
		}else {
			ccount++;
		}
		
		}
		System.out.println("Vowels:"+vcount);
		System.out.println("Consanants:"+ccount);
	}

}
