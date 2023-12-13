package HomeWork;

public class HW119 {
    String phrase;
    char letter;
    void repl(String phrase, char letter){
        System.out.println(phrase.replace(letter,'*'));
    }

    public static void main(String[] args) {
        HW119 n=new HW119();
        n.repl("Hello world", 'l');
    }
}
