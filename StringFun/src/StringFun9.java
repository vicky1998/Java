
public class StringFun9 {
	public static void main(String[] args) {
		String word="bluexx";
		System.out.println(seecolor(word));
		
	}
	
	public static String seecolor(String word) {
		if (word.startsWith("red")) {
			return "red";
			
		}else if(word.startsWith("blue")) {
			return"blue";
		}else
			 return" ";
		
	}
	
	

}
