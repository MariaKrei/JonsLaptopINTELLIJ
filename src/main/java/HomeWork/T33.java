package HomeWork;

import java.util.Scanner;

public class T33 {
    /*
if a user enters a number and it is even, print "Value is even",
after that it should check if the number is greater than 1000 it should also print even number is large otherwise even value is just right.
if number is not even it should print number is odd after that it should check if odd number is greater than 1000 it should say odd value is large otherwise odd value is just right
     */
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Please enter a number");
        double num= sc.nextDouble();
        double numF=num%2;
        if (numF==0){
            System.out.println("Value is even");
            if (num>1000){
                System.out.println("even number is large");
            }else{
                System.out.println("even value is just right");
            }
    }else{
            System.out.println("Value is odd");
            if (num>1000){
                System.out.println("odd value is large ");
            }else{
                System.out.println("odd value is just right");
            }
        }
}

}