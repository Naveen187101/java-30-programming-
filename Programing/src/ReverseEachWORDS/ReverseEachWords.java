package ReverseEachWORDS;

public class ReverseEachWords {

	public static void main(String[] args) {

		String originalString = "java is coding language";
		String[] words = originalString.split(" ");  //split method split the word 
		String reverseString = " "; //initial word will be null

		for (String w : words)
		{
			String reverseWords = " ";
			for (int i = w.length() - 1; i >= 0; i--)  //(java)  we have reverse word so we will use descending order to reverse word
			{
				reverseWords = reverseWords + w.charAt(i); // a=" "+a,   av=a+j,    ava=a+av,  avaj=ava+j
			}
			reverseString = reverseString + reverseWords + " ";  // avaj=" "+avaj+" ", avaj" "si=avaj+si+" ",..........  
		}
		System.out.println(reverseString); 

	}

}
