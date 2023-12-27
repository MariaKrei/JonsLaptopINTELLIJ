package HomeWork;

public class HW134 {





    public   int countVowels(String s) {

        int count = 0;
        char a = 'a';
        char o='o';
        char i='i';
        char u='u';
        char e='e';
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == a||s.charAt(j)==o||s.charAt(j)==u||s.charAt(j)==e||s.charAt(j)==i) {

                count++;

            }


        }System.out.println(count); return count;

    }

    public static void main(String[] args) {
        HW134 b=new HW134();
        b.countVowels("obama");
        b.countVowels("happy friday! i love weekends");

    }}
