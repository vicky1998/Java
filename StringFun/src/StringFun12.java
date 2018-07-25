
public class StringFun12 {
	public static void main(String[] args) {
		String word="java";
		System.out.println(left2(word));
	
}
	public static String left2(String word) {
		
		return word.substring(2, word.length()).concat(word.substring(0, 2));
	}

}
