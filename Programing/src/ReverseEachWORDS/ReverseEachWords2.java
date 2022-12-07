package ReverseEachWORDS;

public class ReverseEachWords2 {

	public static void main(String[] args) {
	
		String orgString="naveen singh rajputh";
		String[] words = orgString.split(" ");
		String reverseString=" ";
		
		for(String w:words)
		{
			String  reverseWord=" ";
			for(int i=w.length()-1; i>=0; i--) 
			{
				reverseWord=reverseWord+w.charAt(i);
			}
			reverseString=reverseString+reverseWord+" ";
		}
		System.out.println(reverseString);
		
	}

}
