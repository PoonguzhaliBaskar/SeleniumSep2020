package day19;

import java.util.Arrays;

public class Concate2Arraysto3rd {

	public static void main(String[] args) {
		int arr1[]={10,20,80};
		int arr2[]={2,5,40,60};
		int length1 = arr1.length;
		int length2 = arr2.length;
		int length3 = length1+length2;
		int[] arr3=new int[length3];
		int count=0;
		for (int i = 0; i <arr1.length; i++) {
			arr3[count]=arr1[i];
			count++;
			System.out.println("count"  +count);
			System.out.println(arr3[i]);
		}
		for (int j = 0; j < length2; j++) {
			arr3[count]=arr2[j];
			count++;
			
		}
		Arrays.sort(arr3);
		for(Integer value:arr3) {
			System.out.print(value+",");
		}
		
	}

}
