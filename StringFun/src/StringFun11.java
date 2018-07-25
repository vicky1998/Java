
public class StringFun11 {
	public static void main(String[] args) {
		String firstWord="hi";
		String secWord="bye";
		System.out.println(makeabba(firstWord,secWord));
		
	}
	public static String makeabba(String firstWord,String secWord ) {
		String str1=firstWord.concat(secWord);//is it possible to written this in 1 line?
		String str2=secWord.concat(firstWord);
		return(str1.concat(str2));
		
	}

}
