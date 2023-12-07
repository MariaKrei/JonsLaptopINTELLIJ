package HomeWork;

public class HW82 {
    public static void main(String[] args) {
        int[][] num = {
                {25, 17, 80,22},
                {7,8,28,96},
                {87,56, 88, 97},
                {20, 18, 80}
        };
        int sum=0;
        for (int row=0; row<num.length; row++){
            for (int column=0; column<num[row].length;column++ ){
                sum=sum+num[row][column];

            }
        }System.out.print(sum);
    }
}
