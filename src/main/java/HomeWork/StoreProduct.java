package HomeWork;

public class StoreProduct {
    private String label;
    private double price;
    private String category;
    private boolean hasExpiration;
    private int stock;

    public StoreProduct(String label, double price, String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }

    public StoreProduct(String label, double price, int stock) {
        this.label = label;
        this.price = price;
      this.category = "misc";
        this.stock = stock;
        this.hasExpiration = false;
    }

    public StoreProduct(String label, double price) {
        this.label = label;
        this.price = price;
        stock = 0;
    }

    public void displayOut1() {
        System.out.println(label + " " + price + " " + category+" " +hasExpiration + " " +stock);
    }






    public static void main(String[] args) {
       StoreProduct n=new StoreProduct("eggs",3, "Produce", true, 10 );
        n.displayOut1();
        StoreProduct b=new StoreProduct("Paper Towels", 2.0, 24);
        b.displayOut1();
        StoreProduct c=new StoreProduct("Paper Towels", 2.0);
        c.displayOut1();
    }}
