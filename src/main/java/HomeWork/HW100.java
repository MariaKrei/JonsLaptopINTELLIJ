package HomeWork;

import java.util.Scanner;

public class HW100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please write a word");
        String s=sc.nextLine();
        for (int i = s.length()-1; i >=0 ; i--) {
            System.out.print(s.charAt(i));

        }

        System.out.println(" ");
    }

}
