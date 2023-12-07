package Class9;

public class Grocery2 {
    public static void main(String[] args) {
        String[][] groceries={
                {"bananas", "apples", "oranges"},
                {"potatoes", "tomatoes","onions"},
                {"milk", "sour cream", "yoghurt"},
                {"candies", "chocolate", "gummy bears"}

        };

            for(String[] bag:groceries){
                for (String grocery:bag){
                    System.out.print(grocery+" ");

            }
        System.out.println();

            }

        }}

