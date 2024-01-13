package Class23;

import java.util.HashSet;
import java.util.Set;

public class E4Sets {

    public static void main(String[] args) {
        Set<String> fruit=new HashSet<>();  //if change second part to linkedHashset order will be maintain
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("apple");  //won't show cause it doesnt show duplicates and random printing
        System.out.println(fruit);

    }}
