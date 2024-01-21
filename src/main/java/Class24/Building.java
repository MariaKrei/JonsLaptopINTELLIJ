package Class24;

import java.util.HashMap;

public class Building {
    public static void main(String[] args) {
        var buildingMap=new HashMap<>();
        buildingMap.put(1,"Google");
        buildingMap.put(2, "Syntax");
        buildingMap.put(3, "Facebook");
        buildingMap.put(4,"Apple");
        buildingMap.put(5, "Samsung");
        buildingMap.put(6, "Love");
        buildingMap.put(7,"Grocery");
        System.out.println(buildingMap.size());
        buildingMap.put(4,"Pharmacy");
        buildingMap.replace(4, "Replaved value");
        System.out.println(buildingMap);
       buildingMap.remove(7);
        System.out.println(buildingMap);


    }
}
