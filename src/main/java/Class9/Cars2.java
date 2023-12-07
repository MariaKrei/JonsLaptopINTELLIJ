package Class9;

public class Cars2 {
    public static void main(String[] args) {
        String[][] cars= {
                {"Cadillac", "Ford"},
                {"BMW", "Mercedes"},
                {"Hunday", "Kia"}
        };


        for (int i = 0; i < cars.length;i++){
            for (int j = 0; j < cars[i].length; j++)
                System.out.print(cars[i][j] + " ");


        }System.out.println();



    }

}

