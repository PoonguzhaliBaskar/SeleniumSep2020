package day20;

import java.util.Arrays;

public class QuickSortArrayPrgm {

	public static void main(String[] args) {
		int[] arraynum= {2,5,1,4,7,3,8,76};
		int low=0,high=arraynum.length-1;
		sortarray(arraynum,low,high);
		System.out.println(Arrays.toString(arraynum));
	}

	public static void sortarray(int arr[],int low,int high) {
		if(arr==null|| arr.length==0)
			return;
		
		//pivot
		int pivot=low+(high-low)/2;
		int median = arr[pivot];
//Looping condition for moving elements left is smaller and right is greater
		int i=low,j=high;
		while(i<=j) {
			while(arr[i]<median) {
						i++;
							}
			while(arr[j]>median) {
				j--;
			}
			if(i<=j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		//Sort left side and right side of the array
		if(low<j) {
			sortarray(arr,low,j);
		}
		if(high>i) {
			sortarray(arr, i, high);
		}
	}
}
