package HomeWork;

import java.util.Scanner;

public class HW95 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter any word");
        String word=sc.nextLine();
        String word2=word.substring(0,3);
        System.out.println("The first 3 letters of "+word+" is "+word2);
    }
}
