package day25;

import java.nio.charset.StandardCharsets;

public class ByteArraytoString {

	public static void main(String[] args) {
		String example = "This is sample text!";
         byte[] bytes=example.getBytes();
         System.out.println(bytes
        		 );
         //to convert byte array to string
         String str=new String(bytes,StandardCharsets.UTF_8);
         System.out.println(str);
	}

}
