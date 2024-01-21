package Class24;

import java.util.Map;
import java.util.TreeMap;

public class CountriesSities {
    public static void main(String[] args) {
        Map<String, String> countriesInfo=new TreeMap<>();
        countriesInfo.put("Russia", "Moscow");
        countriesInfo.put("USA", "Washington DC");
        countriesInfo.put("Kazakhstan", "Astana");
        countriesInfo.put("Thailand", "Bangkok");
        countriesInfo.put("UAE","Abu-Dhabi");
        System.out.println(countriesInfo);
        countriesInfo.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println("***********");
        countriesInfo.forEach((k,v)-> System.out.println(v));
        System.out.println("**********");
        //using for loop
        //Set<String> keys= maps.keySet();

        countriesInfo.entrySet().forEach(x-> System.out.println(x.getValue()));


    }
}
