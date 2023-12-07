package Class9;

public class Array2D {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,50},
                {25,35,66},
                {80,90,78,45},
                {45,55,66}
        };
        System.out.println(matrix[1][1]); //35
        System.out.println(matrix[2][3]);//50
        System.out.println(matrix[3][2]);//66
       // System.out.println(matrix[4][2]);error
        //.length give us number of rows
        System.out.println(matrix.length);
        System.out.println(matrix[0].length); //executes lengths of numbers inside each row
        System.out.println(matrix[2].length);
    }
}
