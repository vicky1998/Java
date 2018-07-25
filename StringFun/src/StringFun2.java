
public class StringFun2 {
	
	public String firstHalf(String s1) {
	   String s= (s1.substring(0,s1.length()/2));
	   return s;
	}
	   
	public static void main(String[] args) {
		String s1="WooHoo";
		StringFun2 s2=new StringFun2();
		System.out.println(s2.firstHalf(s1));
	
	}
	
}
