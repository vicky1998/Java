
public class StringFun13 {
	public static void main(String[] args) {
		String word="hello";
		int len=2;
		System.out.println(nTwice(word,len));
	}
	public static String nTwice(String word,int len) {
		return word.substring(0, len).concat(word.substring(word.length()-len,word.length()));
		
	}

}
