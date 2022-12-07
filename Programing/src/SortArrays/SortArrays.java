package SortArrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortArrays {

	public static void main(String[] args) {
		int arr[]= {50,30,10,70,40,20};
		
		System.out.println("before sorting :"+Arrays.toString(arr));
		//Arrays.sort(arr);
		//Arrays.parallelSort(arr);
		
		//reverse order
		Integer arr1[]= {50,30,10,70,40,20};
		Arrays.sort(arr1,Collections.reverseOrder());
		System.out.println("after sorting :"+Arrays.toString(arr1));
		
	}

}
