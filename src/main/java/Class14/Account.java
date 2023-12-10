package Class14;

public class Account {
    String accountNumber="123";
    double balance=350;
    String userName="user123";
     private String password="pass123";
    public void printHello(){
         System.out.println("Welcome");
     }
     void printingInfo(){
         System.out.println(accountNumber);
     }

    public static void main(String[] args) {
        Account a=new Account();
        a.printingInfo();
    }
}
