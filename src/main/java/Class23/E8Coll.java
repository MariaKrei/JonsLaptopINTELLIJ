package Class23;

import java.util.*;

public class E8Coll {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        System.out.println(numbers); //duplicated and order
        HashSet<Integer> UniqueNumbers=new LinkedHashSet<>(numbers);//keeps data in original order and removes duplicates

        System.out.println(UniqueNumbers);
        TreeSet<Integer> treeSet=new TreeSet<>(UniqueNumbers); //sorted
        System.out.println(treeSet);



    }
}
