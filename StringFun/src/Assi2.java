public class Assi2 {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("hellowoo");
        int length=str.length();
        for(int i=0;i<length/2;i++){
            str.deleteCharAt(length/2);
        }
        System.out.println(str);

    }
}
