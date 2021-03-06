package day23;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		Integer[] arr= {20,30,50,60,40};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		

	}

}
