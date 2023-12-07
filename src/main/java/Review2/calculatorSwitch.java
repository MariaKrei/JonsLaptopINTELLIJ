package Review2;

import java.util.Scanner;

public class calculatorSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Please choose an operator -+*/");
        String op=sc.next();

        String opString;
        switch (op) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println("num1/num2");
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            default:
            System.out.println("Invalid");




        }
    }
}
