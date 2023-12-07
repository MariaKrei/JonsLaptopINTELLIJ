package Class5;

import java.util.Scanner;

public class Task2LogOp {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number of day");
        int day=sc.nextInt();
        if (day>=1&day<=5){
            System.out.println("Its a weekday");
        }else if (day==6&&day==7){

            System.out.println("Its a weekend");
        }else{
            System.out.println("Invalid day");
        }
}}
