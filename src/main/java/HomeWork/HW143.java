package HomeWork;

public class HW143 {
    private String make;

private String model;
private int numberOfDoors;

private int  topSpeed;

private double price;

    public HW143(String make, String model, int numberOfDoors, int topSpeed, int price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public HW143(String make, String model, int topSpeed, int price) {
        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;
        this.price = price;
        this.numberOfDoors=4;
    }

    public HW143(int numberOfDoors, int topSpeed, int price) {
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
        this.make="unknown";
        this.model="unknown";
    }

    public HW143(String make, String model, int numberOfDoors) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed=90;
       this.price=0;
    }
    public  void printAll() {
        System.out.println(make + " " + model + " " + topSpeed + " " + price + " " + numberOfDoors);
    }


    public static void main(String[] args) {
        HW143 a=new HW143("BMW", "x5", 5,200,0);
       a.printAll();
        HW143 b=new HW143("Toyota", "Prius",120, 50000);
        b.printAll();
        HW143 c=new HW143(4, 90, 45000);
        c.printAll();
        HW143 d=new HW143("Toyota", "Prius", 4);
        d.printAll();
    }
}
