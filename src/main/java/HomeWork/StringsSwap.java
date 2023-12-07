package HomeWork;

public class StringsSwap {
    public static void main(String[] args) {
        String name="Maria", name2="Eva";

        name=name+name2; //MariaEva
        name2=name.substring(0,name.length()-name2.length());//MariaEva(0,Maria-Eva)
        name=name.substring(name2.length());//MariaEva(extractEva)
        System.out.println("After swaping name = "+name+" name2 = "+name2);


    }
}
