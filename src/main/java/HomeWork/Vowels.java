package HomeWork;

public class Vowels {

    String printVowels(String address){
        System.out.println( address.replaceAll("[^AaEeOoUuIi]",""));
        return address;
    }

    public static void main(String[] args) {
        Vowels n=new Vowels();
        n.printVowels("Sunny Valley Orange town");
    }
}
