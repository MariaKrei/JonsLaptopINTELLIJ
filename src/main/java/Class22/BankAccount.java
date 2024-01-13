package Class22;

public class BankAccount {
   private  double balance;
   private  String userName;
   private String password;

    public BankAccount(double balance, String userName, String password) {
        this.balance = balance;
        this.userName = userName;
        this.password = password;
    }

    void login(){
        System.out.println("Login into bank account");
    }
    void tranferFunds(){
        System.out.println("Transfer funds");
    }
    void resetPassword(){
        System.out.println("resetting the password");
    }
    //if we want someone will see info from other classes
    double getBalance(){             //getters allows us to expose fields to other classes, no changes
        return balance;
    }

    void setBalance(double balance){
        this.balance=balance;
    }
}
