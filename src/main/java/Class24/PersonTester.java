package Class24;

import java.util.Map;
import java.util.TreeMap;

public class PersonTester {
    public static void main(String[] args) {
        Map<Integer, Person> maps=new TreeMap();
       maps.put(123, new Person ("Maria", "Krei",35,180000));
       maps.put(1234, new Person("John", "Krei", 45, 580000));
        maps.put(12345, new Person("Eva", "Krei", 9, 580000));
        maps.put(12346, new Person("Luke", "Krei", 1, 580000));
        maps.forEach((k,v)->{
            System.out.println("id"+k);
            v.printInfo();
        });
    }
}
