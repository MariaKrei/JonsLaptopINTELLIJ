package Class23;

import java.util.TreeSet;

public class T2 {
    public static void main(String[] args) {
        TreeSet <String> countries=new TreeSet<>();
        countries.add("Russia");
        countries.add("Usa");
        countries.add("Kazakhstan");
        countries.add("Malaysia");
        countries.add("Albania");
        System.out.println(countries);
        for (String ctr:countries){
            System.out.println(ctr);
        }
    }
}
