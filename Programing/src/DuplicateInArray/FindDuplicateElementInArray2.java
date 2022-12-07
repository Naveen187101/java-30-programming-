package DuplicateInArray;

import java.util.HashSet;

public class FindDuplicateElementInArray2 {

	public static void main(String[] args) 
	{
		String arr[] = { "manual","java", "c++", "python", "SQL", "java","manual" };
		boolean flag=false;
		
		HashSet<String> hash=new HashSet<String>();
		
		for(String ele:arr) {
			//System.out.println(hash.add(ele));
			if(hash.add(ele)==false) //false means element not able to add the result will be false
			{
				System.out.println("duplicate element will be present :"+ele);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("duplicate element is not present");
		}
		
	}

}
