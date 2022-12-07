package PalidromeNumber;

import java.util.Scanner;

public class PalidromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int num = sc.nextInt();

		int OriginalNum = num;

		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		if (OriginalNum == rev) {
			System.out.println(rev + " - " + "number is palidrome");
		} else {
			System.out.println(rev + " - " + "number is not palidrome");
		}

	}

}
