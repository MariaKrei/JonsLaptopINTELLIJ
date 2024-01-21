package Class24;

import java.util.LinkedHashMap;
import java.util.Map;

public class BestBuy {
    public static void main(String[] args) {
        Map<Integer, String> bestBuy=new LinkedHashMap<>();
        bestBuy.put(1234, "Printer");
        bestBuy.put(2234, "Laptop");
        bestBuy.put(3234, "Fridge");
        bestBuy.put(4234, "DVD");
        bestBuy.put(5234, "TV");
        bestBuy.entrySet().forEach(x-> System.out.println(x.getKey()));

    }
}
