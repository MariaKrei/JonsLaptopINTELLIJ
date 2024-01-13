package W3School;

import java.util.Scanner;

public class ScPr {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number");
        int num=sc.nextInt();
        if (num%2!=0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
