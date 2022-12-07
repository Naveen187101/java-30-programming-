package SumOfElementArray;

public class SumOfElementInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 }; // length of array is 5
		int sum = 0;

		
		  for(int i=0; i<=arr.length-1; i++) //1 2 3 4 5  
		  {
		  sum=sum + arr[i]; //1=0+1 3=1+2 6=3+3 10=6+4 15=10+5
		  }
		  
		  System.out.println(sum); //15
		 

//Logic2 Enhanced for loop 	
		/*for (int value : arr) {
			sum = sum + value; // 1=0+1 3=1+2 6=3+3 10=6+4 15=10+5

		}
		System.out.println(sum);// 15
		*/


	}

}
