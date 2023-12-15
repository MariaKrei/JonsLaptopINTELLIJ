package HomeWork;

public class HW148 {
    private String item;
    private int price;
    private int quantity;

    public HW148(String item, int price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;}
        public int totalPriceBlanket(){
            System.out.println("Blanket total value is  "+(quantity*price));
            return quantity*price;
    }
            public int totalPriceMatress(){
                System.out.println("Matress total value is  "+(quantity*price));
        return quantity*price;
    }

    public static void main(String[] args) {
        HW148 n=new HW148("Blanket",10,25);
        n.totalPriceBlanket();
        HW148 b=new HW148("Matresses",10,25);
        b.totalPriceMatress();
        int sum=(b.totalPriceMatress()+ n.totalPriceBlanket());

        System.out.println("You purchased" +sum+" Today");


    }
}
