package BasicProgm;

public class FibonacciSeries2 {

	public static void main(String[] args) {
		int fib1 = 0;
		int fib2 = 1;
		int fib3;
		System.out.println("Febonacci series of value 12");
		for (int i = 0; i <= 12; i++) {
			System.out.println(fib1);
			fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
		}

	}

}
