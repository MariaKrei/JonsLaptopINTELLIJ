package Class11;

public class ReplaceAll {
    public static void main(String[] args) {
        String str="bnhdrAC DKLPOU0 987% &%@$";
        System.out.println(str.replaceAll("[A-Z]","*"));
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[0-9]","*"));
        System.out.println(str.replaceAll("[A-D]","*"));
        System.out.println(str.replaceAll("[A-Za-z]","*"));
        System.out.println(str.replaceAll("[A-Za-z0-9]","*"));

        System.out.println(str.replaceAll("[^A-Za-z]","*"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]","*"));
        System.out.println(str.replaceAll("[^A-Za-z]",""));//if we not specify java will remove all letters
        System.out.println(str.replaceAll("[A-Z]","")); //remove instead of replace
        System.out.println((int)'A');
        System.out.println(str.replaceAll("[A-z]",""));//all letters upper and lower
        System.out.println(str.replaceAll("[!-?]",""));//replaces all from tab
        System.out.println(str.replaceAll("[#-*]",""));
        System.out.println(str.replaceAll("[\\d]","*"));
        System.out.println(str.replaceAll("[\\s]","m"));


    }
}
