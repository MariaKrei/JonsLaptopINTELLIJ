package Review7;

public class ReplaceAll {
    public static void main(String[] args) {
        String str="My name is James my numbers is 9123654789";
        String number=str.replaceAll("[^0-9]","");
        System.out.println(number);


    }
}
