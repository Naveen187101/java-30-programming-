package PalidromeString;

import java.util.Scanner;

public class PalidromeString {

	public static void main(String[] args) {

		/*String str = "abcd";
		String rev = "";
		String orgstr = str;*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string value:");
		String str = sc.next();
		String orgstr=str;
		String rev="";

		for (int i = str.length() - 1; i >= 0; i--) 
		{
			rev = rev + str.charAt(i);
		}
		
		
		if (orgstr == rev)
		{
			System.out.println(rev + " - " + "string is palidrome");
		} else
		{
			System.out.println(rev + " - " + "string is not a palidrome");
		}

	}

}
