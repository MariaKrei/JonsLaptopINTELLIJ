package Class22;

import java.util.ArrayList;

public class PrintWLambda {
    public static void main(String[] args) {



    ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Baileys");
        drinks.add("Kalhua");
        drinks.add("Vodka");
        drinks.add("Beer");
        drinks.add("Rootbeer");
        drinks.add("Juice");
        drinks.add("Rum");
        drinks.forEach(x-> System.out.println(x));
}}
