package ReverseString;

public class ReverseStringBuffer {

	public static void main(String[] args) {
		String str = "abcd";

		StringBuffer sb = new StringBuffer(str);
		StringBuffer a = sb.reverse();
		System.out.println(a);
	}

}
