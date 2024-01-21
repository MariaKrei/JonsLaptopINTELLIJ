package Class24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SeparateMaps {
    public static void main(String[] args) {
        Map<String, Integer> maps=new HashMap<>();
        //HashMap<String, Integer> fruit=new HashMap<>();
        maps.put("Apple",20);
        maps.put("Banana", 10);
        maps.put("Orange", 15);
        maps.put("Kiwi", 25);
        System.out.println(maps);
        System.out.println(maps.keySet());
        System.out.println(maps.values());
        Set<String> keys= maps.keySet();
        System.out.println(keys);
        for (String k:keys){
            System.out.println(k);
        }

        ArrayList<String> arrayList=new ArrayList<>(keys);
}}
