package Class22;

import java.util.ArrayList;

public class RemoveElementFromAL {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Baileyse");
        drinks.add("Kalhua");
        drinks.add("Vodka");
        drinks.add("Beer");
        drinks.add("Rootbeer");
        drinks.add("Juice");

        for (int i = 0; i <drinks.size() ; i++) {
            String s=drinks.get(i);
            if (s.endsWith("e")){
                drinks.remove(i);
                i--;  //if we want to remove something we should use i-- to go back and check index0
            }
/*for (String s:drinks){
    if (s.contains("o")){
        drinks.remove(s);
    }*/
}System.out.println(drinks);
        }

    }

