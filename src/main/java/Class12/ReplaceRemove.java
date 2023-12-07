package Class12;

public class ReplaceRemove {
    public static void main(String[] args) {
        String str="mariaKreI2345&*?m";

        System.out.println(str.replaceAll("[^A-Za-z]","").length());

        System.out.println(str.replaceAll("[^A-z]","").length());
        System.out.println(str.isEmpty());


    }
}
