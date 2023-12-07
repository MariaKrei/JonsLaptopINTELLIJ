package Review5;

import java.util.Scanner;

public class ScaArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of array");
int size=sc.nextInt();
int[] numbers=new int[size];
        System.out.println(numbers.length);
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("Please enter the number "+(i+1));
            numbers[i]=sc.nextInt();

        }
    }
}
