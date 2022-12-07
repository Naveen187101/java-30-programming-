package Swaping;

public class Swap5Without3v {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;

		// print statement in single line
		b = a + b - (a = b);
		System.out.println("value of a:" + a + " " + "value of b:" + b);

	}

}
