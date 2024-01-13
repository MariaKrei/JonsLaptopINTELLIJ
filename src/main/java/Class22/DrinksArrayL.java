package Class22;

import java.util.ArrayList;

public class DrinksArrayL {
    public static void main(String[] args) {

        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Baileys");
        drinks.add("Kalhua");
        drinks.add("Vodka");
        drinks.add("Beer");
        drinks.add("Rootbeer");
        drinks.add("Juice");
        drinks.add("Liquor");

        for (int i = 0; i <drinks.size() ; i++) {
            String s=drinks.get(i);
            if (s.contains("a")||s.contains("e")){
                drinks.set(i,"water");
            }

        } System.out.println(drinks);
    }
}
