package Class23;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("Maria");
        aList.add("John");
        aList.add("Eva");
        aList.add("Luke");
        aList.add("Karolisha");
        aList.add("Eva");
        aList.add("Luke");
        aList.add("Karolisha");
       Set names=new LinkedHashSet(aList);  //removed duplicates
       aList.clear();
       aList.addAll(names);
        System.out.println(aList);
    }
}
