package BasicProgm;

public class Factorial {

	public static void main(String[] args) {

		int no = 5;
		int fact = 1;
		for (int i = 1; i <= 5; i++) {
			fact = fact * i;
			System.out.println(fact); // if i print statement in with in the for loop o/p will {1,2,6,24,120}
		}

		System.out.println(fact);// if i print statement in outside the for loop o/p will {120}

	}

}
