package Class24;

import java.util.HashMap;
import java.util.Map;

public class RemoveFromMap {
    public static void main(String[] args) {


    Map<String, Integer> maps=new HashMap<>();
        maps.put("Apple", 20);
        maps.put("Banana", 15);
        maps.put("Kiwi", 5);
        maps.put("Orange", 20);
        maps.put("Grapes", 25);
        maps.put("ololo",10);
        maps.entrySet().removeIf(e->e.getKey().contains("i"));  //entry set first if wee want to apply lambda to maps
        maps.entrySet().removeIf(x->x.getValue()==5); //remove if value=5
        maps.entrySet().removeIf(e->e.getKey().contains("Orange")||e.getValue()>=20||e.getKey().toLowerCase().contains("o"));
        System.out.println(maps);




    }}
