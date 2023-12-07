package Class5;

import java.util.Scanner;

public class TaskLogOp1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your height in inches ");
        double height= sc.nextDouble();


        if (height<60){
            System.out.println("short");
        }else if (height>60&&height<72){
            System.out.println("medium");
        }else{
            System.out.println("tall");
        }
    }
}
