package Class22;

public class Product {
    private String productID;
    private String name;
    private double price;
    private int stockQuantity;
    public Product (String productID, String name, double price, int stockQuantity){
        this.productID=productID;
        this.name=name;
        this.price=price;
        this.stockQuantity=stockQuantity;}
    public int restock(int amount){
        return stockQuantity+amount;}
    public double sell (int amount){
        int a=stockQuantity-amount;
        if (a>0){
            return a*price;
        }else{
            System.out.println("Your stock is empty");}return 0;}
    public void printProductDetails(){
        System.out.println("The name of the product is "+name+" and the ID of the product is "+productID+" and the price of the product is "+price+". We have "+stockQuantity+" pc in stock");}
    public String getName(){
        return name;}
    public void setName(String name){
        this.name=name;}
    public double getPrice(){
        return price;}
    public void setPrice(double price){
        this.price=price;}
    public int getStockQuantity(){
        return stockQuantity;}
    public void setStockQuantity(int stockQuantity){
        this.stockQuantity=stockQuantity;}
    public static void main(String[] args) {
        Product p=new Product("011N","Laptop",590, 15);
        System.out.println( "Restock is equals to " +p.restock(7));
        System.out.println("The product was sold for the amount of " +p.sell(20));
        p.printProductDetails();
        p.setName("Ipad");
        System.out.println("Name of product has been changed to "+p.getName());
       p.setPrice(1500);
        System.out.println("The price of product has been changed to "+p.getPrice());
       p.setStockQuantity(100);
        System.out.println("The stock quantity has been changed to "+p.getStockQuantity());
    }

}

