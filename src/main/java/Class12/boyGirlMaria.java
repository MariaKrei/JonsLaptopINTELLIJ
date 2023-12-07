package Class12;

import java.util.Scanner;

public class boyGirlMaria {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your father's name?");
        String fatherName= sc.nextLine();
        System.out.println("What is your mother's name?");
        String motherName= sc.nextLine();
        System.out.println("Do you expected a girl or a boy?");
        String gender=sc.nextLine();
        String babyBoylName=(fatherName.substring(0,fatherName.length()/2)+motherName.substring(motherName.length()/2,motherName.length()));
        String babyGirllName=(motherName.substring(0,motherName.length()/2)+fatherName.substring(fatherName.length()/2, fatherName.length()));
        if (gender.equals("boy")){
            System.out.println(babyBoylName);
        }else if(gender.equals("girl"))
            System.out.println(babyGirllName);
        }

    }

