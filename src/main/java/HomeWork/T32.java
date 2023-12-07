package HomeWork;
/*"Ask the user to enter his/her gender \"Please enter your gender: M or F\" and their age \"Please enter your age\"\n" +
                "\n" +
                "You have 2 conditions:\n" +
                "\n" +
                "If age is above 25, then check if a user entered F then the output should be \"Woman\" otherwise it should say \"Man\"\n" +
                "\n" +
                "If age is below 25, then check if a user entered F then the output should be \"Girl\" otherwise it should say \"Boy\"");*/
import java.util.Scanner;

public class T32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        char gender=sc.next().charAt(0);
        System.out.println("Please enter your age");
        int age=sc.nextInt();
        if (gender=='F'){
            if (age<=25){
                System.out.println("Girl");
            }else{
            System.out.println("Woman");
        }
    }else if (age<=25){
            System.out.println("Boy");
        }else{
            System.out.println("Man");}
}}
