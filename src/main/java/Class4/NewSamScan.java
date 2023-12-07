package Class4;

import java.util.Scanner;

public class NewSamScan {
    public static void main(String[] args) {
        System.out.println("What is age of your dog? ");
        Scanner scan=new Scanner(System.in);
        int age=scan.nextInt();

        System.out.println("age of your dog is "+ age);
    }
}
