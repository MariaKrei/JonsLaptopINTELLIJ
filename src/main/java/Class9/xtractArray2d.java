package Class9;

public class xtractArray2d {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 50},
                {25, 35, 66},
                {80, 90, 78, 45},
                {45, 55, 66}
        };
        // entire one 1D array from the 2d array
        int[] row0=matrix[0];
        System.out.println(row0.length); //3for

        for (int num:row0){
            System.out.print(num+" ");

        } System.out.println();
        //accessing individual elements from 2d array
        System.out.println(matrix[2][2]);


    }
}
