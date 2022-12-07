package ReverseString;

import java.util.Scanner;

public class ReverseStringBuffer1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str = sc.next();
		String orgstr=str;
				
		StringBuffer s=new StringBuffer(str);
		StringBuffer rev = s.reverse();
		
		System.out.println(rev);

	}

}
