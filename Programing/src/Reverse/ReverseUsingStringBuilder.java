package Reverse;

import java.util.Scanner;

public class ReverseUsingStringBuilder {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sr.nextInt();

		StringBuilder str = new StringBuilder();
		str.append(num);
		StringBuilder rev = str.reverse();
		System.out.println(rev);

	}

}
