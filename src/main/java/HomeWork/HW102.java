package HomeWork;

import java.util.Scanner;

public class HW102 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));

        }
    }
}
