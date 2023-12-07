package Class9;

public class AllNumbersFromm2dArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 50},
                {25, 35, 66},
                {80, 90, 78, 45},
                {45, 55, 66}
        };



    for (int row=0; row<matrix.length; row++){              //tells us how many rows
        for (int col=0; col<matrix[row].length; col++){          //tell us how many items in each row
        System.out.print(matrix[row][col]+" ");
}
        System.out.println();
}}}
