package Class11;

public class UsernamePassword {
    public static void main(String[] args) {
        String username="mariaKrei";
        String password="lola2601";
        String confirmPassword="lola2601";
        if (username.isEmpty()&&password.isEmpty()) {
            System.out.println("Username or password cannot be empty");
        }else  if (password.length()<8) {
            System.out.println("Password is too short");
        }else if (password.contains(username)){
                    System.out.println("Password cannot contain username");
                }else if (!password.equals(confirmPassword)){
            System.out.println("Password do not match");
        }else{
            System.out.println("Your username and password has been created");
        }
            }
        }



