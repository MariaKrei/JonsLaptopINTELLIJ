package Class9;

public class CarsEnhancedLoop {
    public static void main(String[] args) {
        String[][] cars= {
                {"Cadillac", "Ford"},
                {"BMW", "Mercedes"},
                {"Hunday", "Kia"}
        };
for(String[] arr:cars){
    for (String car:arr)
    System.out.println(car+" ");
}
        System.out.println();
    }


}
