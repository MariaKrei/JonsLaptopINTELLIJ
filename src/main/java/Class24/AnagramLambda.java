package Class24;

import java.util.Arrays;

public class AnagramLambda {
    public static void main(String[] args) {
        String name="silent";
        String name2="listenaq";
       char[] nameArr=name.toCharArray();
       char[] name2Arr=name2.toCharArray();
        Arrays.sort(nameArr);
        Arrays.sort(name2Arr);
        if ( Arrays.equals(nameArr, name2Arr)){
            System.out.println("Anagram");
        }else{
            System.out.println("not an anagram");
        }

    }
}
