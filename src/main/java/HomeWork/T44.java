package HomeWork;

import java.util.Scanner;

public class T44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
        String car=sc.nextLine();
        switch (car){
            case "BMW":
                System.out.println("german car");
                break;
            case "Toyota":
                System.out.println("Japanese car");
                break;
            case "Maserati":
                System.out.println("Italian Car");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}
