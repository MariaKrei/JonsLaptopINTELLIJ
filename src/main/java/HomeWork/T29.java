package HomeWork;

import java.util.Scanner;

public class T29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter first number");
        double num1=sc.nextDouble();
        System.out.println("Please enter second number");
        double num2=sc.nextDouble();
        if (num1*num2>0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
