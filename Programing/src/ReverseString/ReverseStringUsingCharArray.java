package ReverseString;

public class ReverseStringUsingCharArray {

	public static void main(String[] args) {

		String str = "abcd";
		String rev = "";
		char arr[] = str.toCharArray();

		for (int i = str.length() - 1; i >= 0; i--) { // length is 4, a=0,b=1,c=2,d=3
			rev = rev + arr[i]; // d=""+d, dc=d+c, dcb=dc+b, dcba=dcb+a

		}
		System.out.println(rev); // dcba

	}

}
