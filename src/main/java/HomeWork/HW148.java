package HomeWork;

public class HW148 {
    private String item;
    private double price;
    private double quantity;

    public HW148(String item, double price, double quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;}
        public double totalPrice(){
        double totalValue=price*quantity;
            System.out.println(item+"Total Value"+totalValue);
            return totalValue;
    }


    public static void main(String[] args) {
        HW148 n=new HW148("Blanket",99.98,1);
     double  blanketTotal= n.totalPrice();
        HW148 b=new HW148("Matresses",439.18,1);
        double matressTotal=b.totalPrice();
        double sum=matressTotal+blanketTotal;


        System.out.println("You purchased " +sum+" Today");


    }
}
