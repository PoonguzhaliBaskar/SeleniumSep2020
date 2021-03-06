package day20;

import java.util.Arrays;

public class BuubleSort {
	public static void main(String[] args) {
		BuubleSort obj=new BuubleSort();
		int[] array= {12,54,23,54,24,34};
		obj.bubblesort(array);
		System.out.println(Arrays.toString(array));
	}
		void bubblesort(int arr[]) {
			for (int i = 0; i < arr.length-1; i++) {
				for (int j = 0; j < arr.length-i-1; j++) {
					
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}}}
