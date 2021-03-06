package day19;

public class CountwordsinString {

	public static void main(String[] args) {
String str="Hello world of Auto Testing";
int count=1;
for (int i = 0; i < str.length(); i++) {
	System.out.println("1st:"+str.charAt(i));
	System.out.println(str.charAt(i+1));
		if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')){
		count++;
	}
	
}
System.out.println(count);
	}

}
