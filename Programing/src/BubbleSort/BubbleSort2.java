package BubbleSort;

import java.util.Arrays;

public class BubbleSort2 {

	public static void main(String[] args) {

		int a[] = { 50, 40, 60, 30, 20 };
		System.out.println("before sorting :" + Arrays.toString(a));

		for (int i = 0; i < a.length - 1; i++) 
		{
			for (int j = 0; j < a.length - 1; j++) 
			{
				if (a[j] > a[j + 1]) 
				{
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("after sorting :" + Arrays.toString(a));
	}

}
