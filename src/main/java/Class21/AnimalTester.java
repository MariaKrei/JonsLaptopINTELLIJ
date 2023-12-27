package Class21;

public class AnimalTester {
    // Animal animal=new Animal();
    public static void main(String[] args) {
        Cat c=new Cat("Luvky", "gray");
        c.eat();;
        c.sleep();;
        c.speak();
        Animal c2=new Cat("Jacky", "white");
        Animal d2=new Dog("Amelia", "brown");

        Animal[] arr={new Cat("Mano", "white"), new Dog("Mano", "black")};
        for (Animal a:arr){
            a.eat();
            a.speak();
            a.sleep();
        }
    }
}
