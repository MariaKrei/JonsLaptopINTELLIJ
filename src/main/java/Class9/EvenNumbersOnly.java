package Class9;

public class EvenNumbersOnly {
    public static void main(String[] args) {
        int [][] numbers={
            {14,25,26,28},
            {3,8,15,19},
            {27,98,95,65}};
        for (int i=0;i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                if (numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
