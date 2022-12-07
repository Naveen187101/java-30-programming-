package DuplicateInArray;

public class FindDuplicateElementInArray {
	public static void main(String[] args) {
		String arr[] = { "manual","java", "c++", "python", "SQL", "java" };
		boolean status = false;

		for (int i = 0; i < arr.length; i++) //0=manual   1=java  2=c++   3=python  4=SQL  5=java
		{
			for (int j = i+1; j < arr.length; j++) //i+1=0+1=1=java  c++   python  SQL  java
			{

				if (arr[i].equals(arr[j])) 
				{
					System.out.println("element in array is duplicate :" + arr[i]);
					status = true;
				}
				
			}

		}
		if (status == false) 
		{
			System.out.println("element in array is not duplicate");
		}


	}
}
