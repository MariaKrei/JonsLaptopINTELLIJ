package Class11;

public class IndexAt1 {
    public static void main(String[] args) {
        String str="Today is Saturday";
        System.out.println(str.indexOf('T'));
        System.out.println(str.indexOf('o'));
        System.out.println(str.indexOf('a')); // multiple chars java will execute first index
        System.out.println(str.indexOf('Z')); //doesnt exist - will be -1
//print indexes of letter a

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'){
                System.out.println(i);

        }

        }

    }
}
