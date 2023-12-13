package HomeWork;

public class Reverse {
    String name;
    String RevName(String name) {
        String name2 = " ";
        for (int i = name.length() - 1; i >= 0; i--) {
            name2 = name2 + name.charAt(i);


        }
        return name2;


    }
public static void main(String[] args) {
        Reverse n=new Reverse();
    System.out.println(n.RevName("Maria"));
    }}