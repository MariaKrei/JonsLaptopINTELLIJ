package HomeWork;

import java.util.Scanner;

public class T27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the length ");
        double lenght=sc.nextDouble();
        System.out.println("Please enter the width ");
        double width=sc.nextDouble();
        if (lenght==width){
            System.out.println("The shape of your object is square");
        }else{
            System.out.println("The shape of your object is rectangle");
        }
    }
}
