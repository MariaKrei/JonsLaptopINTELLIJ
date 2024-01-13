package Class22;

import java.util.ArrayList;

public class MethodsArrL {
    public static void main(String[] args) {
        ArrayList names =new ArrayList<>();
        names.add("Mary");
        names.add("John");
        names.add("Nastya");
        names.add("Lulu");
        names.add("Jane");
        System.out.println(names.size());
        System.out.println(names.contains("Lesya"));
        System.out.println(names.remove("Lulu"));
        System.out.println(names);
        System.out.println(names.remove(2));//Nastya
        System.out.println(names);

        System.out.println(names.set(0, "Maria Krei"));
        System.out.println(names);
        System.out.println(names.indexOf("John")); //index on which name is stored
        System.out.println(names.get(0));

        //speed, use array. tester cn use Arraylist

    }
}
