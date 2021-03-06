package day26;

public class Bubblesort {

	public static void main(String[] args) {
		String str[]= {"Naveen","Hari","sam","Legend","Mohan"};
		//String lstr = str.toString().toLowerCase();
for (int i = 0; i < str.length; i++) {
	for (int j = i+1; j < str.length; j++) {
		if(str[i].compareTo(str[j])<0) {
			String temp=str[j];
			str[j]=str[i];
			str[i]=temp;
		}
		
		}
	System.out.println(str[i]);
	}
}
	}


