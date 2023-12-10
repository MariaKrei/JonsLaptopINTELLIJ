package Class11;

public class Substring {
    public static void main(String[] args) {
        String str="Today is Saturday";// first letter has index0
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(6,8));
        System.out.println(str.substring(9,str.length()));
        String str2="Java is fun";
        System.out.println(str2.substring(0,4));
        System.out.println(str2.substring(5,7));
        System.out.println(str.substring(4));
        System.out.println();
    }
}
