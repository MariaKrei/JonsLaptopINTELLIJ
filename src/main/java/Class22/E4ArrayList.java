package Class22;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {


    ArrayList <String> names =new ArrayList<>();
        names.add("Mary");
        names.add("John");
        names.add("Nastya");
        names.add("Lulu");
        names.add("Jane");
        for (int i = 0; i <names.size() ; i++) {
            //  System.out.println(names.get(i).length); or
            String s=names.get(i);
            System.out.println(names.get(i));

        }
        for (String a:names){
            System.out.println( a.length());

        }
} }
