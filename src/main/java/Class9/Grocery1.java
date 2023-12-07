package Class9;

public class Grocery1 {
    public static void main(String[] args) {
        String[][] groceries={
                {"bananas", "apples", "oranges"},
                {"potatoes", "tomatoes","onions"},
                {"milk", "sour cream", "yoghurt"},
                {"candies", "chocolate", "gummy bears"}

        };

        for (int i=0; i<groceries.length; i++){
            for (int j=0; j<groceries[i].length; j++){
                System.out.print (groceries[i][j] +" ");


            }System.out.println();

        }


    }
}
