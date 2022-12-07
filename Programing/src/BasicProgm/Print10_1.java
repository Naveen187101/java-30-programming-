package BasicProgm;

public class Print10_1 {

	public static void main(String[] args) {
		for (int i = 10; i >= 1; i--) { // for loop
			System.out.println(i);
		}

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // drawback for each we cannot print in reverse order
		for (int a : arr) {
			System.out.println(a);
		}
	}

}
