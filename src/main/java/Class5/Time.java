package Class5;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What time is it");
        int time= sc.nextInt();
        if (time>=1&&time<=11){
            System.out.println("Morning");
        }else if (time>=12&&time<=15){
            System.out.println("Afternoon");
        }else if (time>=16&&time<=20){
            System.out.println("evening");
        }else if (time>=21&&time<=24){
            System.out.println("nigth");
        }else{
            System.out.println("invalid");
        }
    }
}
