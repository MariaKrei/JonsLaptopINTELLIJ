package Class24;

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, Integer> maps=new HashMap<>();
        maps.put("Apple", 20);
        maps.put("Banana", 15);
        maps.put("Kiwi", 5);
        maps.put("Orange", 20);
        maps.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println("********");
        maps.forEach((k,v)->{
            if (k.contains("a")||v>20){
                System.out.println(k+" "+v);
            }
        });

}}
