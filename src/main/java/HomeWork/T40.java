package HomeWork;

import java.util.Scanner;

public class T40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of the Child");
        int age=sc.nextInt();


        switch (age){
            case 1:
                System.out.println("You can crawl");
                break;
                        case 2:
            System.out.println("you can talk");
                break;
                        case 3:
                            System.out.println("You can dance");
                            break;
            case 4:
                System.out.println("You can trouble");
                break;
            default:
                System.out.println("I don't know how old you are");

        }
    }
}
