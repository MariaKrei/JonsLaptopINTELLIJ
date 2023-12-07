package Review5;

public class RowfromArray {

    public static void main(String[] args) {
        int [][] numbers= {
                {10, 20, 30, 40},
                {20, 40, 60, 80},
                {30, 60, 90, 120}
        };

    int[] row0=numbers[0];//only row 0
        for (int i = 0; i <=numbers.length ; i++) {
            System.out.print(row0[i]+" ");


        }

}
}
