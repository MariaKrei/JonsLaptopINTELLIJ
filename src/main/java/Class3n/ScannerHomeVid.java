package Class3n;

import java.util.Scanner;

public class ScannerHomeVid {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("What is your first name?");
       String name=scan.next();
        System.out.println(name);

        System.out.println("What is your age");
        int age= scan.nextInt();


    }
}
