package HomeWork;

import java.util.Scanner;

public class HWLoopSc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write a number");
        int num=sc.nextInt();
        for (int i=0; i<num; i++){
            System.out.println(i);
        }
    }
}
