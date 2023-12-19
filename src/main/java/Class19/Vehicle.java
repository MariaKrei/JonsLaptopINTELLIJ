package Class19;

public class Vehicle {
    private int speed;
    private String color;
    private String fuelType;

    public Vehicle(int speed, String color, String fuelType) {
        this.speed = speed;
        this.color = color;
        this.fuelType = fuelType;
    }
    public void accelerate(){
        System.out.println("press gas ");
    }
    public void brake(){
        System.out.println("Press brake");
    }
  public void   printInfo(){
      System.out.println(speed+" "+color+" "+fuelType);
  }
}

class Car extends Vehicle{
    public Car(int speed, String color, String fuelType) {
        super(speed, color, fuelType);
    }
    public void accelerate(){
        System.out.println("spped up ");
    }
    public void   printInfo(){
       super.printInfo();
        System.out.println("Finally i did it!");
    }
    public void shutDoor(){
        System.out.println("shut the door");
    }
}
class Truck extends Vehicle{
    public Truck(int speed, String color, String fuelType) {
        super(speed, color, fuelType);
    }
    public void accelerate(){
        System.out.println("more gas for heavy loads ");
    }
    public void heavyLoad(){
        System.out.println("Load more");
    }
}

class Motorcycle extends Vehicle{
    public Motorcycle(int speed, String color, String fuelType) {
        super(speed, color, fuelType);
    }
    public void accelerate(){
        System.out.println("press gas in next life ");
    }
    public void takeHelmet(){
        System.out.println( "please don't forget your helmet");
    }
}
class Bicycle extends Vehicle{
    public Bicycle(int speed, String color, String fuelType) {
        super(speed, color, fuelType);
    }
    public void accelerate(){
        System.out.println("don't speed up ");
    }
    public void putBasketOn(){
        System.out.println("Put on your basket");
    }
}
