
public class StringFun8 {
	public static void main(String[] args) {
		String firstWord="vicky";
		String secondWord="yadav";
		System.out.println(lastChars(firstWord,secondWord));
	}
	public static String lastChars(String firstWord ,String secondWord) {
		
		String completeWord=firstWord.concat(secondWord);
		
		 int len= completeWord.length();
		  String f=completeWord.substring(0, 1);
		  String s=completeWord.substring(len-1,len);
		 return f.concat(s);
	}
	
	
	

}
