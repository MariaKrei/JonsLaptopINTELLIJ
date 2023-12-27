package Class19;

public class Product {
    private int price;
    private String name;
    private int SKU;
    public Product(int price, String name, int SKU) {
        this.price = price;
        this.name = name;
        this.SKU = SKU;}
    public void calculateTaxes(){
        if (price<=1000){
            System.out.println("Your taxes will be 5%");
        }else if (price>1001||price<2000){
            System.out.println("Your taxes will be 6%");

        }else{
            System.out.println("Your taxes will be 10%");
        }
    }
    public void printInfo(){
        System.out.println("The name of the product is " +name+" the price of the product is "+price+" SKU is "+SKU);
    }
    public void makeChoice(){
        System.out.println("Please make choice of your product");
    }
    public double getPrice(){return price;}
}
class Electronics extends Product{
    private int warranty;
    public Electronics(int price, String name, int SKU, int warranty) {
        super(price, name, SKU);
        this.warranty=warranty;
    }
    public double applyWarranty(){
double warPrice=getPrice()+warranty;
        System.out.println("Your warranty added to your price. Your prce is going to be "+warPrice);
        return warPrice;
    }

    public void makeChoice(){
        System.out.println("Please make choice of your Electronic product");
    }

    }

class Closing extends Product {
    public Closing(int price, String name, int SKU) {
        super(price, name, SKU);
    }public void makeChoice(){
        System.out.println("Please make choice of your clothes");
    }
}
class Furniture extends Product {
    public Furniture(int price, String name, int SKU) {
        super(price, name, SKU);
    }
    public void makeChoice(){
        System.out.println("Please make choice of your furniture");
    }
}
class Books extends Product{
    public Books(int price, String name, int SKU) {
        super(price, name, SKU);
    }
    public void makeChoice(){
        System.out.println("Please make choice of your boooks");
    }
    }