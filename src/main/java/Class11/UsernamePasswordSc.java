package Class11;

import java.util.Scanner;

public class UsernamePasswordSc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your username");
        String username=sc.nextLine();
        System.out.println("Please create a password");
        String password= sc.nextLine();
        System.out.println("Please confirm password");
        String confirmPassword=sc.nextLine();
        if (username.isEmpty()&&password.isEmpty()){
            System.out.println("Username and password cannot be empty");
        }else if (password.length()<8){
            System.out.println("Password is too short");
        }else if (password.contains(username)){
            System.out.println("Password cannot contain username");
        }else if (!password.equals(confirmPassword)){
            System.out.println("Passwords do not match");
        }else{
            System.out.println("You created username and a password" );
        }
    }
}
