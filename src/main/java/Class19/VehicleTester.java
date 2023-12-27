package Class19;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle[] arr={new Car(100,"blue","gas"), new Truck(120, "white","diesel"), new Motorcycle(50,"black","gas"),new Bicycle(5,"purple","legs")};
for (Vehicle vehicle:arr){
    vehicle.accelerate();
    vehicle.brake();
    vehicle.printInfo();
    if (vehicle instanceof Car){
        Car c=(Car)vehicle;
        c.shutDoor();}
    if (vehicle instanceof Truck){
        Truck t=(Truck)vehicle;
        t.heavyLoad();}
    if (vehicle instanceof Motorcycle){
        Motorcycle m=(Motorcycle) vehicle;
    m.takeHelmet();}
    if (vehicle instanceof Bicycle){
        Bicycle b=(Bicycle) vehicle;
        b.putBasketOn();
    }
}   }
}
