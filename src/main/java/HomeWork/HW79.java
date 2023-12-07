package HomeWork;

public class HW79 {
    public static void main(String[] args) {
       double [][] num={
                {1.4, 2.0, 3.3, 2.0 },
                {4.0, 1.5, 6.1, 1.0 },
                {1.2, 3.1, 4.0, 1.6 },
        };
       for (int i=0; i<num.length; i++){
           for (int j=0; j<num[i].length; j++){
               System.out.print(num[i][j]+" ");
           }
           System.out.println();
       }


    }
}
