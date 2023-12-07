package HomeWork;

public class HW81 {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 50},
                {25, 35, 66},
        };
       int largest=matrix[0][0];
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){

               if (largest>matrix[i][j]){
                   System.out.println("Number "+largest+" is largest");
               }

            }
        }
    }
}