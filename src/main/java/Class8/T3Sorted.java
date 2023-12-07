package Class8;

public class T3Sorted {
    public static void main(String[] args) {
        //int[] numbers={10,15,20,18,9,60,22,30};
        int[] numbers={10,20,28,39,60,72,2};
boolean isSorted=true;
for (int i=0; i<numbers.length-1; i++){
    if (numbers[i] > numbers[i+1]){
            isSorted=false;
            break;

    }

          } System.out.println("Array is sorted =  " +isSorted);
        }
}
