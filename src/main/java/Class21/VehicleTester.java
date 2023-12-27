package Class21;

public class VehicleTester {
    public static void main(String[] args) {
      Vehicle[] arr={new Car("BMW", "X6", 15),
              new Motorcycle("Harley Davidson", "M6", 8),
              new Truck("GMC", "AT4", 35)};
    for (Vehicle veh:arr){
        veh.printInfo();
        veh.startEngine();
        veh.stopEngine();
        veh.fillUp();
    }

    }
}
