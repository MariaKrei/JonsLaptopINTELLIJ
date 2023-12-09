package Review7;

public class IndexOf {
    public static void main(String[] args) {
        String str="this one should ba false ";
        System.out.println(str.indexOf('o'));
        System.out.println(str.indexOf("one"));// will return index of first
        System.out.println(str.indexOf("is"));
        System.out.println(str.indexOf("z"));//doesn't exist and that is why -1
}}
