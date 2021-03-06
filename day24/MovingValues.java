package day24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MovingValues {

	public static void main(String[] args) {
Integer[] values= {4,0,3,1,0,1,0};
Arrays.sort(values,Collections.reverseOrder());
System.out.println(Arrays.toString(values));


List<Integer> list1=new ArrayList<>();
List<Integer> list2=new ArrayList<>();
for (int i = 0; i < values.length; i++) 
	if(i==0) {
		list1.add(values[i]);
}
	else if(i!=0) {
		list2.add(values[i]);
		}
		List<Integer> finallist=new ArrayList<>(list1);
			finallist.addAll(list2);
		System.out.println(finallist);
	
	}
	}


