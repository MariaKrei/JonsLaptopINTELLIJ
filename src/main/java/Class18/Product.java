package Class18;

public class Product {
    private String prName;
    double price;
    double quantity;
    public Product(String prName, double price, double quantity) {
        this.prName = prName;
        this.price = price;
        this.quantity = quantity;}
    public void printInfo(){
        System.out.println(prName+price+quantity);}
    public void  CalculateTotal(){
       double  total=price*quantity;
        System.out.println("The total price is "+total);}}
class DiscountedProduct extends Product{
    public double discount;
    public DiscountedProduct(String prName, double price, double quantity, double discount) {
        super(prName, price, quantity);
        this.discount = discount;}
    public void  CalculateTotal(){
        double  total=price*quantity-discount;
        System.out.println("The discounted price is"+ total);
        }
}