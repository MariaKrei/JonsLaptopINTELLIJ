package Class24;

import java.util.HashMap;
import java.util.Map;

public class MaosEx {
    public static void main(String[] args) {
        Map<String, Integer> maps=new HashMap<>();
        //HashMap<String, Integer> fruit=new HashMap<>();
        maps.put("Apple",20);
        maps.put("Banana", 10);
        maps.put("Orange", 15);
        maps.put("Kiwi", 25);
        maps.put("Kiwi", 30); //replace previous value
        System.out.println(maps);
        System.out.println(maps.size());
        System.out.println(maps.containsKey("Apple".toLowerCase()));
        System.out.println( maps.containsValue(25));
        System.out.println( maps.containsValue(35));
        System.out.println(maps.isEmpty());
        System.out.println(maps.get("Kiwi"));



    }

}
