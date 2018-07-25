
public class StringFun4 {
public static void main(String[] args) {
	String s1="Red";
	boolean b1=false;
	System.out.println(theEnd(s1,b1));

}
public static  String theEnd(String s1,boolean b1) {
	//int len=s1.length();
	
	if(b1==true) {
		return s1.substring(0,1);
		
		
	}else 
	{
	
      return s1.substring(s1.length()-1);
    }

}
}
