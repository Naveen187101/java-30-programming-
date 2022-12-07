package BubbleSort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int a[] = { 2, 1, 5, 4, 3 };
		System.out.println("before sorting :" + Arrays.toString(a));

		for (int i = 0; i < a.length-1; i++) //n-1 i declare number passes required
		{
			for (int j = 0; j < a.length-1; j++)  //n-1 declare number of swap or integration
			{ 
				if (a[j] > a[j + 1]) 
				{
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("after sorting :"+Arrays.toString(a));

	}

}
