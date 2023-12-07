package Class8;

public class ArrayBreak {
    public static void main(String[] args) {
        int [] numbers={10,25,26,30,40,45,2};
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]==26){

            System.out.println("Number 26 is present");
            break; //breaks loop
        }}
    }
}
