
public class StringFun3 {
	public static String nonStart(String s1,String s2 ) {
		
		return s1.concat(s2);
		
		
	}
	public static void main(String[] args) {
		String first="hello";
		String sec="there";
	   String s1=first.substring(1);
		String s2=sec.substring(1);
		System.out.println(nonStart(s1,s2));
		
	}

}
