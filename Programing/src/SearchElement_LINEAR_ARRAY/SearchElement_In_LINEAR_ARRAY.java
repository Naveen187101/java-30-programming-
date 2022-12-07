package SearchElement_LINEAR_ARRAY;

public class SearchElement_In_LINEAR_ARRAY 
{

	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50};
		int search=40;
		boolean flag=false;
		
		for(int i=0; i<arr.length; i++) 
		{
			if(search==arr[i]) {
				System.out.println("element found at index is :"+i);
				flag=true;
				break;
			}
			
		}
		if(flag==false) {
			System.out.println("element not found");
		}
				
	}
}

