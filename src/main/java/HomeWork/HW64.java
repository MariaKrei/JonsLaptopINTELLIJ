package HomeWork;

import java.util.Scanner;

public class HW64 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write a number");
        int num=sc.nextInt();
        for (int i=0; i<num*2; i++){
            System.out.println(i);
        }
    }
}
