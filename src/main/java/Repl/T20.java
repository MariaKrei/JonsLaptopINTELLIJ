package Repl;

import java.util.Scanner;

public class T20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your age");
        int age=sc.nextInt();
        System.out.println("Enter your mobile number");
        String num=sc.next();
        System.out.println("Your name is "+name+" your age is "+age+" your mobile number is "+num);
    }
}
