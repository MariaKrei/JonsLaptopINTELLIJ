package Class16;

public class AnimalTester {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.name="Jacky";
        d.age=10;
        d.weight=5;
        d.printInfo();
        d.bark();
        Cat c=new Cat();
        c.name="Lulu";
        c.age=2;
        c.weight=3;
        c.sleep();
        c.printInfo();


    }
}
