package Arrays_Comparing;

import java.util.Arrays;

public class UsingEqualsMethod {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 1, 2, 3, 4, 5 };

		boolean status = Arrays.equals(arr1, arr2);

		if (status == true)
		{
			System.out.println("arrays ara equals");
		} 
		else 
		{
			System.out.println("arrays ara not equals");

		}

	}

}
