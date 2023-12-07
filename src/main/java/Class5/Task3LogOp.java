package Class5;

import java.util.Scanner;

public class Task3LogOp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number");
        double number= sc.nextDouble();
        if (number>=1&&number<=10) {
            System.out.println("small");
        } else if (number>=11&&number<=100){
            System.out.println("medium");
        }else if (number >= 101 && number <= 1000) {
            System.out.println("large");
        }else{
            System.out.println("wrong number");
        }


    }
}
