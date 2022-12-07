package MissingArray;

public class MissingArrayNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5};
		//array should not have duplicate
		// logic is number no need to be sorted order
		//Values should be with in range
		// first we calculate sum of array and calculate sum range of array
		//1+2+3+5=11 (sum of array)  and  1+2+3+4+5=15 (sum range of array)
		// sum1 - sum2
		
		
		int sum1=0;
		for(int i=0; i<arr.length; i++)
		{
			sum1=sum1+arr[i];
		}
		System.out.println("sum of element in array  "+sum1);
		
		int sum2=0;
		for(int i=1; i<=5; i++)
		{
			sum2=sum2+i;
		}
		System.out.println("sum of range of element "+sum2);
		
		System.out.println("missing number is : "+(sum2-sum1));
		
	}

}