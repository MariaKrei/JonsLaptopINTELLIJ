package Class19;

public class ProductTester {
    public static void main(String[] args) {
        Product [] arr={new Books(10, "War and peace", 123456),new Closing(15, "pants", 654321), new Electronics(500, "TV", 159789, 25), new Furniture(200, "chair", 123698745)  };
        for (Product p:arr){
            p.printInfo();
            p.calculateTaxes();
            p.getPrice();
            p.makeChoice();
            if (p instanceof Electronics){
            Electronics e=(Electronics) p;
            e.applyWarranty();
            }


                }
            }
        }

