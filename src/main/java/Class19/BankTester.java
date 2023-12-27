package Class19;

public class BankTester {
    public static void main(String[] args) {
        BankAccount[] arr={new CheckingAccount(), new SavingAccount(), new FixedDepositAccount()};
        for (BankAccount c:arr){
            c.deposit();
            c.withdraw();
            if (c instanceof SavingAccount){
                SavingAccount s=(SavingAccount) c;
                s.applyInterest();
            }
        }
    }
}
