package Class5;

import java.util.Scanner;

public class IgnoreCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("write your name");
        String name=sc.nextLine();
        if (name.equalsIgnoreCase("Maria")){
            System.out.println("You are the best");
        }

    }
}
