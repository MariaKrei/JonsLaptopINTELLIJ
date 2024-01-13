package Review11;

public class BankAccount {
    private double balance ;
    BankAccount(double balance){
        if (balance<0){
            System.out.println("wrong balance");
        }
        this.balance=balance;
    }
    void transferFunds(double amountTransfer){
        balance=balance-amountTransfer;
    }
  }
  class BankTester{
      public static void main(String[] args) {
          BankAccount b=new BankAccount(-9000);
      }
  }