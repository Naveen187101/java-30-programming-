package ToRemoveSpace;

public class RemoveSpace {

	public static void main(String[] args) {
		
		String s="my name is naveen   i am from magadi";
		System.out.println("before remove space: "+s);
		s=s.replaceAll("\\s", ""); // we using backward slash
		System.out.println("after remove space: "+s);
		
	}

}
