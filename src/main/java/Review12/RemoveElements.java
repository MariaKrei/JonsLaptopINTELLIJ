package Review12;

import java.util.LinkedHashMap;

public class RemoveElements {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> studentsMap=new LinkedHashMap<>();
        studentsMap.put("John", 95);
        studentsMap.put("maris", 88);
        studentsMap.put("eva", 90);
        studentsMap.put("luke", 100);
        studentsMap.put("Karolina", 88);
        studentsMap.entrySet().removeIf(x->x.getValue()<90||x.getKey().contains("a"));
        System.out.println(studentsMap);
    }
}
