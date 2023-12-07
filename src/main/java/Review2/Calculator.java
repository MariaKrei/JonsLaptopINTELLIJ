package Review2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        System.out.println("Please choose an operator -+*/");
        String op=sc.next();
        double plus=num1+num2;
        double minus=num1-num2;
                double mult=num1*num2;
                double dev=num1/num2;
        if (op.equals("+")){
            System.out.println(plus);
        }else if (op.equals("-")){
            System.out.println(minus);
        }else if (op.equals("*")){
            System.out.println(mult);
        }else  {
            System.out.println(dev);
        }
    }
}
