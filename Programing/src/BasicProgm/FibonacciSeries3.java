package BasicProgm;

public class FibonacciSeries3 {

	public static void main(String[] args) {
		int fib1 = 0;
		int fib2 = 1;
		int fib3;
		System.out.println("Febonacci series of value 7");
		for (int i = 0; i <= 7; i++) {
			System.out.println(fib1);
			fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
		}
	}

}
