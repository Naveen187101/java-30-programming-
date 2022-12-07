package PrintEven_odd_In_Array;

public class Even_odd_in_Array {

	public static void main(String[] args) {
		int arr[] = { 7, 8, 9, 4, 5 };
		
		System.out.println("print even values in Array ");
		/*for (int i = 0; i <= arr.length - 1; i++) 
		{
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);

			}
		}*/
		
		//Enhanced for loop
		for(int i:arr) {
			if(arr[i]%2==0 )
			{
				System.out.println(i);
			}
		}
		
		System.out.println("print odd values in Array ");
		for (int i = 0; i <= arr.length - 1; i++)
		{ 
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}

		}

	}
}
