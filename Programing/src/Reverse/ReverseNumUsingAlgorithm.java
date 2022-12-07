package Reverse;

import java.util.Scanner;

public class ReverseNumUsingAlgorithm {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);
		System.out.println("enter number:");
		int num = sr.nextInt();

		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10; //0*10 + 123%10 =0+3=3, 3*10 + 12%10= 30+2=32, 32*10 + 1/10=320+1=321
			num = num / 10;// 123/10=12, 12/10=1, 1/10=0

		}

		System.out.println(rev);//321
	}

}
