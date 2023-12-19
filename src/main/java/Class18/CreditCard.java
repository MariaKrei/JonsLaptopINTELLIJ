package Class18;

public class CreditCard {

        public void InterestRate(double amount){
            double interest=amount*0.07;
            System.out.println("Interest on "+amount+" is "+interest);

    }
}
class Visa extends CreditCard{}
class AX extends CreditCard{
    @Override
    public void InterestRate(double amount) {
        double interest=amount*0.07;
        System.out.println("Interest on "+amount+" is "+interest);

    }
}

class CreditCardTester{
    public static void main(String[] args) {
        CreditCard c=new CreditCard();
        Visa v=new Visa();
        AX a=new AX();
        c.InterestRate(1500);
        v.InterestRate(500);
        a.InterestRate(1000);
    }

}
