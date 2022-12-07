package ToRemoveJunkANDspecialChar;

public class ToRemoveJunk_SpecialChar {

	public static void main(String[] args) {

		String s = "@#$%%%%ABCDefgh123";
		s = s.replaceAll("[^a-z A-Z 0-9]", ""); // we use ^ button print only (a-z A-Z 0-9)
		System.out.println(s);
	}

}
