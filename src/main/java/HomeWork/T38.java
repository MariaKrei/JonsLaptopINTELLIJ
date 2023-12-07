package HomeWork;

import java.util.Scanner;

public class T38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Is it weekend?");
        boolean weknd=sc.nextBoolean();
        if (weknd==true){
            System.out.println("Today you will be learning Java");
        }else{
            System.out.println("Today you will be learning manual testing");
        }
    }
}
