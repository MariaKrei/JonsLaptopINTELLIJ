package Class24;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Lamda {
    public static void main(String[] args) {
        Map<Integer, String> studentsMap=new LinkedHashMap<>();
        studentsMap.put(1,"Luke");
        studentsMap.put(2,"John");
        studentsMap.put(3,"Karolina");
        studentsMap.put(10,"Eva");
        studentsMap.put(5,"Maris");
        System.out.println(studentsMap);
        //map->Entry->Key and values
     // Set<Map.Entry<Integer, String >> studentEntries= studentsMap.entrySet();
        Set<Map.Entry<Integer, String>> entries = studentsMap.entrySet();

       for(Map.Entry<Integer,String> e:entries){
           if (e.getKey()>2){
           System.out.println(e.getKey()+" "+e.getValue());
       }}
        System.out.println("*********************");
    var enttries2=studentsMap.entrySet();
       for (var e:enttries2){
           var key=e.getKey();
           var value=e.getValue();
           System.out.println(key+" "+value);
       }

        System.out.println("*****************");
//lamda

       studentsMap.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
