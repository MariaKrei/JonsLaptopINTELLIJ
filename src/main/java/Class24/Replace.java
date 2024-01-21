package Class24;

import java.util.HashMap;

public class Replace {
    public static void main(String[] args) {
        var buildingMap=new HashMap<>();
        buildingMap.put(1,"Google");
        buildingMap.put(2, "Syntax");
        buildingMap.put(3, "Facebook");
        buildingMap.put(4,"Apple");
        buildingMap.put(5, "Samsung");
        buildingMap.put(6, "Love");
        buildingMap.put(7,"Grocery");
        System.out.println(buildingMap);
        buildingMap.replace(4,"New company");
        System.out.println(buildingMap);  //
        buildingMap.put(4, "New new "); //better not to use cause it will put new value

       // buildingMap.forEach((k,v)->);  //method with loop build inside authomatically
    }
}
