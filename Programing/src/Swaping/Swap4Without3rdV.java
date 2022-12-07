package Swaping;

public class Swap4Without3rdV {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;

		// using bitwise XOR a ^ b(use bitwise calculator in browser)
		a = a ^ b; // 20^10=30 (binary format XOR 30=11110)
		b = a ^ b; // 30^10=20 (binary format XOR 20=10100)
		a = a ^ b; // 30^20=10 (binary format XOR 10=1010)

		System.out.println("value of a:" + a + " " + "value of b:" + b);

	}

}
