package Class11;

public class CharAtExHowManyLetters {
    public static void main(String[] args) {
        String str="Java is Fun";
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'){
                count++;


            }
    }System.out.println("There are "+count+ "letters A in the String");
}}
