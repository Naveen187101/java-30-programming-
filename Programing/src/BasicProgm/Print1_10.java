package BasicProgm;

public class Print1_10 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) { // for loop
			System.out.println(i);
		}
		int[] arr = { 1, 2, 3, 4, 5 };// for each
		for (int z : arr) {
			System.out.println(z);
		}
		
		
		//To print RCCA36 to RCCA239
		for(int i=36; i<=239; i++) {
			System.out.println("RCCA"+i);
		}
	}

}
