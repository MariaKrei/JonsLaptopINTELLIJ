package Class5;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your quiz score");
        double quiz=sc.nextDouble();
        System.out.println("Please enter your mid term score");
        double midScore= sc.nextDouble();
        System.out.println("Please enter your final score");
        double finalSc=sc.nextDouble();
        double averSc=(quiz+midScore+finalSc)/3;
        if (averSc>=90){
            System.out.println("Grade A");
        }else if (averSc>=70){
            System.out.println("Grade B");
        }else if (averSc>=50){
            System.out.println("Grade C");
        }else if (averSc<50){
            System.out.println("Grade F");
        }



    }
}
