package Class19;

public class BankAccount {
    public void withdraw(){
        System.out.println("withdraw money ");
    }
    public void deposit(){
        System.out.println("deposit money");
    }}
class SavingAccount extends BankAccount{
    public void withdraw(){
        System.out.println("take money from the account ");}
    public void applyInterest(){
        System.out.println("Your interest will be 10%");
    }}
class CheckingAccount extends BankAccount{
    public void deposit(){
        System.out.println("put money on accoint");}}
class FixedDepositAccount extends BankAccount{}