package HomeWork;

import java.util.Scanner;

public class HW104 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter 5 names");
        String[] strAr=new String[5];
                strAr[0]=sc.nextLine();
        strAr[1]=sc.nextLine();
        strAr[2]=sc.nextLine();
        strAr[3]=sc.nextLine();
        strAr[4]=sc.nextLine();

        for (int i = 0; i <strAr.length ; i++) {
            System.out.println(strAr[i].substring(0,3));



        }


    }
}
