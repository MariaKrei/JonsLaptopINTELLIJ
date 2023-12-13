package HomeWork;

public class HW115 {
    String words;
    void upperCase(String words){
        String n=words.toUpperCase();
        System.out.println(n);
    }

    public static void main(String[] args) {
        HW115 a=new HW115();
        a.upperCase("Test");
    }
}
