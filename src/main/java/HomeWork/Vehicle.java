package HomeWork;

public class Vehicle {
    private String name;

    public Vehicle() {
        System.out.println("I love vehicles");
    }

    public Vehicle(String name) {
        System.out.println("I love "+name);
    }

    public static void main(String[] args) {
        Vehicle n=new Vehicle("Tesla");

    }
}
