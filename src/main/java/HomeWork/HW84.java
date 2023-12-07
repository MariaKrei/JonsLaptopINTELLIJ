package HomeWork;

public class HW84 {
    public static void main(String[] args) {
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int count=0;
        for (int i=0; i<a.length; i++){
            for (int b=0; b<a[i].length; b++){
                if (a[i][b]<0&&a[i][b]%2!=0)
                count++;

            }

                }System.out.print(count);

                }


        }


