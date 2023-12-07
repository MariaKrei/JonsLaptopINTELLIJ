package Class3n;

public class HomeWorkIfElseNested2 {
    public static void main(String[] args) {
        int
                rate=1;
        int price=150000;
        if (rate>4.5){
            System.out.println("Don't buy a house");
        }else{
            System.out.println("Buy a house");
            if (price>100000){
                System.out.println("Take a loan");
            }else{
                System.out.println("pay cash");
            }
        }
    }
}
