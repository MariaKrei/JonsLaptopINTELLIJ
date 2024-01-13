package Class22;

import java.util.ArrayList;

public class E7arrayIfLetterPresent {
    public static void main(String[] args) {
        //print yes if name contains letter o and print yes,  otherwise no for all names


    ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Baileys");
        drinks.add("Kalhua");
        drinks.add("Vodka");
        drinks.add("Beer");
        drinks.add("Rootbeer");
        drinks.add("Juice");
       for (String s:drinks){
           if (s.contains("o")){
               System.out.println("yes");

           }else{
               System.out.println("No");
           }
       }


}}
