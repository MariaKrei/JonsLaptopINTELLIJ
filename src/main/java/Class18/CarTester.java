package Class18;

public class CarTester {

        public static void main(String[] args) {
            Car c=new Car("BMW", "W8", 2021);
            LuxuryCar l=new LuxuryCar("Ferrari", "diabolo ", 2023, 650);
            EconomyCar e=new EconomyCar("mazda","5", 2022);
            c.calculateRentalPrice(10,55);
            l.calculateRentalPrice(10,550);
            e.calculateRentalPrice(5,35);}
    }

