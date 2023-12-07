package Class9;

public class SortArray {
    public static void main(String[] args) {


    int[] numbers={10,25,26,30,49,45,45};
        // innitially storing first number as previous
    int previous=numbers[0];
    //a variable to track if we
    boolean isSorted=true;
    for (int current:numbers){
        if (previous>current){
            isSorted=false;
            break;


        }previous=current;
    }
        System.out.println("is array sorted ="+isSorted);

}}
