package BinarySearch;

import java.util.Arrays;

public class BinarySearch2 {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
		//System.out.println(Arrays.binarySearch(a, 80)); //index value of 80 is 7
		
		int l = 0;
		int h = a.length - 1;
		int key = 50;
		boolean flag = false;

		while (l <= h) 
		{
			int m = (l + h) / 2;
			
			if (a[m] == key) 
			{
				System.out.println("element found: index value is " + m + ", " + "key value is " + key);
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
	}

}
