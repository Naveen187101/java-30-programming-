package TotalCountChar;

public class TotalCountOf_a_Char {

	public static void main(String[] args) 
	{
		String s="java is best subject for coding";
		int total_count = s.length();
		int remove_count = s.replaceAll("j", "").length();
		
		int count = total_count-remove_count;
		System.out.println("count of j variable is: "+count);
	}

}
