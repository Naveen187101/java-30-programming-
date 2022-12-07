package BasicProgm;

public class PrintOddNum {

	public static void main(String[] args) {
		System.out.println("print 1 to 10 odd num");
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		System.out.println("print 10 to 1 odd num");
		for (int i = 10; i >= 1; i--) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
