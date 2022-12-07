package ReverseString;

public class ReverseString1 {

	public static void main(String[] args) {

		String str = "abcd"; // length=4 (index will start 0) a=0,b=1,c=2,d=3
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) { // 3 , 2 , 1 , 0

			rev = rev + str.charAt(i);// d=""+d, dc=d+c, dcb=dc+b, dcba=dcb+a
		}

		System.out.println(rev);
	}

}
