
public class StringFun7 {
	public static void main(String[] args) {
		String str1="candy";
		System.out.println(middleThree(str1));
		
	}
	public static String middleThree(String str1) {
	return(str1.substring(str1.length()/2-1,str1.length()/2+2));
		
	}

}
