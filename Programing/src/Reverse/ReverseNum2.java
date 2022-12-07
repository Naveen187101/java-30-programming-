package Reverse;

import java.util.Scanner;

public class ReverseNum2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int num=sc.nextInt();
		
		int OriginalNum=num;
		
		
		StringBuffer str=new StringBuffer(String.valueOf(num));
		StringBuffer rev = str.reverse();

		System.out.println(rev);
	}

}
