package day20;

import java.util.ArrayList;
import java.util.Collections;

public class RandomNumber {

	public static void main(String[] args) {
		ArrayList<Integer> inte=new ArrayList<Integer>();
		for (int i = 0; i <=10; i++) {
			inte.add(i);
		}
		//System.out.println(inte);
		Collections.shuffle(inte);
//System.out.println(inte);
	for (int i = 0; i < 5; i++) {
		System.out.println(inte.get(i));
	}

}}
