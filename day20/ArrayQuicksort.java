package day20;

import java.util.Arrays;

public class ArrayQuicksort {

	public static void main(String[] args) {
		int[] arr1= {1,3,4,7,8,2,5,9,36,11,78};
		System.out.println(Arrays.toString(arr1));
	int low=0;
	int high=arr1.length-1;
	quicksort(
, low, high);
	System.out.println(Arrays.toString(arr1));
		
	}
		public static void quicksort(int[] arr,int low, int high) {
		
		  if(arr==null|| arr.length==0) return; 
		  if(low>=high) return;
		 
		
			//pick pivot
			System.out.println("low"+low);
			System.out.println("high"+high);
			int middle=low+(high-low)/2;
			int pivot= arr[middle];
			
			//Making left <pivot  ang right >pivot
			int i=low,j=high;
			while (i<=j) {
			while(arr[i]<pivot) {
				System.out.println("arr[i]"+arr[i]);
				System.out.println("I"+i++);	
			
			}
			while(arr[j]>pivot) {
				System.out.println("arr[j]"+arr[j]);
				System.out.println("j"+j--);
				
			}
			if(i<=j) {
				System.out.println("i"+i);
				System.out.println("j"+j);
				System.out.println("arr[i]"+arr[i]);
				int temp=arr[i];
				
				System.out.println("temp"+temp);
				System.out.println("equals"+(arr[i]=arr[j]));
				arr[j]=temp;
				System.out.println("arr[j]"+arr[j]);
				System.out.println("plus"+i++);
				System.out.println(j--);
			}}
			//Sort for two sub parts
			System.out.println("low"+low);
			System.out.println("j"+j);
			System.out.println("high"+high);
			System.out.println("i"+i);
				if(low<j) 
					quicksort(arr,low,j);
				if(high>i)
					quicksort(arr,i,high);
				
			}
			
	}