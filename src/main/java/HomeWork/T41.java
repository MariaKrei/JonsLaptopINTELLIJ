package HomeWork;

import java.util.Scanner;

public class T41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the roll number of the Child");
        int num=sc.nextInt();
        switch (num){
            case 101:
                System.out.println("Ramesh");
                break;
            case 102:
                System.out.println("Makesh");
                break;
            case 103:
                System.out.println("Mukesh");
                break;
            default:
                System.out.println("Not found Student name: in Class");
        }

    }
}
