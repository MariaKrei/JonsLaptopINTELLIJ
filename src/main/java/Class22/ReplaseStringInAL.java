package Class22;

import java.util.ArrayList;

public class ReplaseStringInAL {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        //if drinks contains letter o replace it to java
        drinks.add("Baileys");
        drinks.add("Kalhua");
        drinks.add("Vodka");
        drinks.add("Beer");
        drinks.add("Rootbeer");
        drinks.add("Juice");
        for (int i = 0; i <drinks.size() ; i++) {
            String s=drinks.get(i);
            if (s.contains("o")){
               drinks.set(i,"Java");
            }

        }
        System.out.println(drinks);
    }
}
