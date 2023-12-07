package Class1;

import java.util.Scanner;

public class T22 {
    public static void main(String[] args) {
       // Input the boolean value
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the boolean value");
        boolean result=sc.nextBoolean();
        if (result==true){
            System.out.println("The value is true");

        }else{
            System.out.println("The value is false");
        }
    }
}
