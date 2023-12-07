package HomeWork;

import java.util.Scanner;

public class HW99Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please type a word");
        String word=sc.nextLine();
        String palindrome="";
        for (int i =word.length()-1; i>=0 ; i--) {
            palindrome=palindrome+word.charAt(i);
        }


        if (word.equalsIgnoreCase(palindrome)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}

