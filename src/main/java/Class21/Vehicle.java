package Class21;

public abstract class Vehicle {
    private String make;
    private String model;
    private int fuelLevel;
    public Vehicle (String make,String model, int fuelLevel){
        this.make=make;
        this.model=model;
        this.fuelLevel=fuelLevel;}
    public void printInfo(){
        System.out.println(make +" "+ model+" "+ fuelLevel);
    }
public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void fillUp();}
class Car extends Vehicle{
    public Car(String make,String model, int fuelLevel)
    {
        super(make, model, fuelLevel);
    }
    public void startEngine(){
        System.out.println("Start your car with button start ");
    };
    public   void stopEngine(){
        System.out.println("Stop engine by pressing button Stop");
    };
    public   void fillUp(){
        System.out.println("Go to a gas station");};}
class Truck extends Vehicle{
    public Truck(String make,String model, int fuelLevel){
        super(make, model, fuelLevel);
    }
    public void startEngine(){
        System.out.println("Start your truck with button start ");
    };
    public   void stopEngine(){
        System.out.println("Stop engine by pressing button Stop om your truck");
    };
    public   void fillUp(){
        System.out.println("Fill up the truck");};}
class Motorcycle extends Vehicle{
    public Motorcycle(String make,String model, int fuelLevel){
        super(make, model, fuelLevel);
    }
    public void startEngine(){
        System.out.println("Start your motorcycle  with button start ");
    };
    public   void stopEngine(){
        System.out.println("Stop engine by pressing button Stop");
    };
    public   void fillUp(){
        System.out.println("Fill up the motorcycle. Go to gas station");};}

