package Reverse;

import java.util.Scanner;

public class ReverseNum3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num = sc.nextInt();
		
		int orgnum=num;
		
		StringBuilder str=new StringBuilder();
		str.append(num);
		StringBuilder rev = str.reverse();
		
		System.out.println(rev);
		
		
	}

}
