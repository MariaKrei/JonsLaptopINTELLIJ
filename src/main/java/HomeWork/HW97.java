package HomeWork;

import java.util.Scanner;

public class HW97 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any browser");
            String browser = sc.nextLine();
            if (browser.equalsIgnoreCase("Chrome")){
                System.out.println("Proceed with Chrome browser");
            }else if (browser.equalsIgnoreCase("firefox")){
                System.out.println("Proceed with Firefox browser");
            }else if (browser.equalsIgnoreCase("IE")){
                System.out.println("Proceed with IE browser");
            }else{
                System.out.println("Invalid browser");
            }

        }
}
