package Maximum_and_minimumNumberInArray;

public class MaximumAND_MinimumArray {

	public static void main(String[] args) 
	
	{
		//MAXIMUM VALUE
		int arr[]= {1,2,3,4,5};
		int max=arr[0]; //1
		
		for(int i=1; i<arr.length; i++) 
		{
			if(arr[i]>max) //2>1  3>1  4>1  5>1
			{
				max=arr[i]; //2   3    4     5
			}
			
		}
		System.out.println("maximum element of array is: "+max);// maximum value is 5
		
		//MINIMUM VALUE
		int min=arr[0]; //1
		
		for(int i=1; i<arr.length; i++) 
		{
		if(arr[i]<min) //2<1  3<1  4<1  5<1
		{
			min=arr[i];// 1    1    1    1
		}
		
		}
		System.out.println("minimum element of array is: "+min);// minimum value is 1
	}

}
