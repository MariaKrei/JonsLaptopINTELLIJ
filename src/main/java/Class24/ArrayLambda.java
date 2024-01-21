package Class24;

import java.util.ArrayList;

public class ArrayLambda {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Morio");
        names.add("Ray");
        names.add("Hayan");
        names.add("Jay");
        names.add("Mayan");

        names.forEach(e-> System.out.println(e));
        System.out.println("******************");
        names.forEach(e-> {
            if (e.contains("a")) {
                System.out.println(e);}





        }); //started {} if we use lambda more than once
        System.out.println("*******");
        names.removeIf(d->d.length()>4);
        System.out.println(names);
       // names.stream(). play with it }
}}
