package BinarySearch;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) 
	{
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; //value should be sorted
		int key = 9;  //seach 9 element
		int l = 0;    //intial l is 0
		int h = a.length - 1;
		boolean flag = false;

		while (l <= h)
		{
			int m = (l + h) / 2;    //m is mid value of array
			if (a[m] == key) 
			{
				System.out.println("element found :"+"key values is "+key+", "+"index value is "+m);
				flag = true;
				break;

			}
			if (a[m] < key)
			{
				l = m + 1;
			}
			if (a[m] > key) 
			{
				h = m - 1;
			}

		}
		if (flag == false)
		{
			System.out.println("element not found");
		}

		/*int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(Arrays.binarySearch(a, 7));   //7 is index value*/
	}

}
