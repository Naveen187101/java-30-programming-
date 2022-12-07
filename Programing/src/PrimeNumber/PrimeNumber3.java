package PrimeNumber;

public class PrimeNumber3 
{

	public static void main(String[] args) 
	{
		for(int j=1; j<=100; j++) 
		{
			int num=j;
			int count=0;
			
			if(num>1) 
			{
				for(int i=1; i<=num; i++) 
				{
					if(num%i==0)
						count++;
				}
				if(count==0) 
				{
					System.out.println(num+ ":prime number");
				}
				else
				{
					System.out.println(num+ ":not a prime number");
				}
				
			}
			else 
			{
				System.out.println(num+ ":not a prime number");
			}
		}
	}
}


