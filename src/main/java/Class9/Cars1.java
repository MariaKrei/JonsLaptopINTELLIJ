package Class9;

public class Cars1 {
    public static void main(String[] args) {


    String[][] cars={
            {"American","German","Korean","Italian"},
            {"Cadillac", "BMW","Hunday","Ferrari"}
    };
        for (int i=0; i<4; i++){              //tells us how many rows

                System.out.println(cars[0][i]+" "+cars[1][i]);
}
    }
}