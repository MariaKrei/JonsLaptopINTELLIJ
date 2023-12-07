package Class9;

public class HowManyCountries {
    public static void main(String[] args) {


    String[][] countries={
            {"USA", "Canada"},
            {"Brazil", "Argentina", "Paraguay"},
            {"Russia", "Italy", "Spain", "Germany"},
            {"Tunisia", "Egypt", "Marocco", "SAR"},
            {"Thailand", "Malaysia", "India", "China"},
    };

   int totalNumbers=0;
   for (int i=0; i<countries.length; i++){
       totalNumbers=totalNumbers+countries[i].length;

        } System.out.println(totalNumbers);
    }


}
