package day19;

import java.util.ArrayList;
import java.util.List;

public class Arraylisttoarray {

	public static void main(String[] args) {
		/*
		 * List<Integer> itemList = new ArrayList<Integer>(); itemList.add(20);
		 * itemList.add(30); itemList.add(40); itemList.add(50); Integer[] arr=new
		 * Integer[itemList.size()]; for (int i = 0; i < itemList.size(); i++) {
		 * arr[i]=itemList.get(i); System.out.println(arr[i]); }
		 */
	
   List<String> itemList = new ArrayList<String>();
itemList.add("Java");
itemList.add("And");
itemList.add("Sel");
itemList.add("Pratice");
//String[] arr=new String[itemList.size()];
for(String str:itemList)
/*for (int i = 0; i < itemList.size(); i++) {
arr[i]=itemList.get(i);
System.out.print(arr[i]+" ");*/
	System.out.print(str+" ");
}
   
	}

