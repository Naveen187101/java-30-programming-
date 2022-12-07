package Reverse;

import java.util.Scanner;

public class ReverseUsingStringBuffer {

	public static void main(String[] args) {

		Scanner sr=new Scanner(System.in);
		System.out.println("enter number: ");
		int num = sr.nextInt();
		
		StringBuffer str=new StringBuffer(String.valueOf(num));
		StringBuffer rev = str.reverse();
		System.out.println(rev);
	}

}
