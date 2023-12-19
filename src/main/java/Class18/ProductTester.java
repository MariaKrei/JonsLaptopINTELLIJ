package Class18;

public class ProductTester {
    public static void main(String[] args) {
        Product apple=new Product("apples", 3, 10);
        DiscountedProduct appleDisc=new DiscountedProduct("apples", 3, 10, 5);
       apple.printInfo();
       apple.CalculateTotal();
       appleDisc.CalculateTotal();
    }
}
