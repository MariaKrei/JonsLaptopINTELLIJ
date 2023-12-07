package Class9;

public class CountriesEnhansed {
    public static void main(String[] args) {
        String[][] countries={
                {"USA", "Canada"},
                {"Brazil", "Argentina", "Paraguay"},
                {"Russia", "Italy", "Spain", "Germany"},
                {"Tunisia", "Egypt", "Marocco", "SAR"},
                {"Thailand", "Malaysia", "India", "China"},
        };
        for (String[] x:countries){
            for (String y:x){
                System.out.print(y+" ");

            }System.out.println();
        }

    }
}
