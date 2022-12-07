package BasicProgm;

public class FibonacciSeries {

	public static void main(String[] args) {
		int fib1 = 0;
		int fib2 = 1;
		int fib3;
		for (int i = 0; i <= 10; i++) {

			System.out.println(fib1);// 0,1,1,2,3,..............................
			fib3 = fib1 + fib2;// 1=0+1, 2=1+1, 3=1+2, 5=2+3, 8=3+5,............
			fib1 = fib2; // 1=1,1=1, 2=2, 3=3, 5=5,......................
			fib2 = fib3; // 1=1,2=2, 3=3, 5=5, 8=8,.............

		}
	}

}
