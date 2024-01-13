package Class23;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveStratWithA {
    public static void main(String[] args) {
        Set<String> cities=new LinkedHashSet<>();
        cities.add("UstKut");
        cities.add("St.Louis");
        cities.add("Panama city beach");
        cities.add("Amsterdam");
cities.removeIf(x->x.startsWith("A"));
        System.out.println(cities);
    }
}
