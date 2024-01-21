package Review12;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class MapExample1 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> studentsMap=new LinkedHashMap<>();
        studentsMap.put("John", 95);
        studentsMap.put("maris", 88);
        studentsMap.put("eva", 90);
        studentsMap.put("luke", 100);
        studentsMap.put("Karolina", 88);
        System.out.println(studentsMap);
        ArrayList <String> names=new ArrayList<>();
        studentsMap.forEach((k,v)->{
            if (v>=90)
                names.add(k);

        });System.out.println(names);

    }
}
