package Review3;

public class LogOpOr {
    public static void main(String[] args) {
        String welcomeMessage="Welcome";
        boolean adminMessage=!true;
        if (welcomeMessage.equals("Welcome")||adminMessage){
            System.out.println("You are logged in");
        }else {
            System.out.println("You are not logged in");
        }
    }
}
