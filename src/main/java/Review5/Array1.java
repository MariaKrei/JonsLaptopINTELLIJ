package Review5;

public class Array1 {
    public static void main(String[] args) {
        int [] numbers={10,25,36,56,80};
        System.out.println(numbers.length);
        System.out.println(numbers[2]); //extract number from array
        //error out of bound - wrong indext, not exist

        for (int i=0; i<numbers.length/2; i++ ){//half of string
            System.out.print(numbers[i]+" ");
        }
    }
}
