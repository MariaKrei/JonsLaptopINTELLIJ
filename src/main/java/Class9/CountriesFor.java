package Class9;

public class CountriesFor {
    public static void main(String[] args) {
        String[][] countries={
                {"USA", "Canada"},
                {"Brazil", "Argentina", "Paraguay"},
                {"Russia", "Italy", "Spain", "Germany"},
                {"Tunisia", "Egypt", "Marocco", "SAR"},
                {"Thailand", "Malaysia", "India", "China"},
        };
        for (int i=0; i<countries.length; i++){
            for (int j=0; j<countries[i].length;j++){
                System.out.print(countries[i][j]+" ");


            }System.out.println();

        }


    }
}
