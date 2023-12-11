package Class14;

public class StringReverse {
public static String word (String str){
    String reverseWord="";
    for (int i = str.length()-1; i >=0 ; i--) {
       reverseWord=reverseWord+str.charAt(i);

    }
return reverseWord;
}

    public static void main(String[] args) {
        StringReverse a=new StringReverse();

    }}



