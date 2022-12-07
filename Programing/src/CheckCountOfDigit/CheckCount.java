package CheckCountOfDigit;

public class CheckCount {

	public static void main(String[] args) {
		int num = 7894;
		int count = 0;

		while (num > 0) {
			num = num / 10; // 7894/10=789 789/10=78 78/10=7 7/10=0 condition is false
			count++; // 1 2 3 4
		}
		System.out.println("num of count is " + count);

	}

}
