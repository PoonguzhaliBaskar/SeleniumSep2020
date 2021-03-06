package day24;

import java.util.HashMap;
import java.util.Map;

public class Stringcount {

	public static void main(String[] args) {
		String str="Welcome to Chennai";
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        char[] strArrayval = str.toCharArray(); 
for (char c: strArrayval) {
	if(map.containsKey(c)) {
		map.put(c, map.get(c)+1);
	}
	else {
		map.put(c,1);
	}}
		for(Map.Entry val: map.entrySet() ) {
		System.out.println(val.getKey()+"-"+val.getValue());
	}
		
	}
}
