package Class5;

import java.util.Scanner;

public class Birth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your birth months");
        String month=sc.nextLine();
        if (month.equalsIgnoreCase("March")||month.equals("April")||month.equals("May")){
            System.out.println("Spring");
        }else if (month.equalsIgnoreCase("June")||month.equals("July")||month.equals("August")){
            System.out.println("Summer");
        }else if (month.equalsIgnoreCase("September")||month.equals("October")||month.equals("November")){
            System.out.println("Autumn");
        }else if (month.equalsIgnoreCase("December")||month.equals("January")||month.equals("February")){
            System.out.println("Winter");
        }else{
            System.out.println("Invalid data");
        }

    }
}
