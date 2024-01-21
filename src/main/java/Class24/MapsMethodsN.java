package Class24;

import java.util.HashMap;
import java.util.Map;

public class MapsMethodsN {
    public static void main(String[] args) {
        Map<String, Integer> maps=new HashMap<>();
        //HashMap<String, Integer> fruit=new HashMap<>();
        maps.put("Apple",20);
        maps.put("Banana", 10);
        maps.put("Orange", 15);
        maps.put("Kiwi", 25);
        System.out.println(maps);
        maps.remove("Kiwi");
        System.out.println(maps);
        maps.replace("Apple", 35);
        System.out.println(maps);
        maps.clear();
        System.out.println(maps);
    }
}
