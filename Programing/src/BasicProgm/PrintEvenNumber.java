package BasicProgm;

public class PrintEvenNumber {

	public static void main(String[] args) {

		System.out.println("print 1 to 10 even num");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("print 10 to 1 even num");
		for (int i = 10; i >= 1; i--) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
