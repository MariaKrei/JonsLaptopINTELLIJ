package Class19;

public class AnimalTester {
    public static void main(String[] args) {
        Animal a=new Dog("Jacky","black",1,12);

        Dog d=(Dog)a;
        d.bark();
        Dog d1=new Dog("Jacky", "White", 1, 12);
        Cat c1=new Cat("Mila","brown",2,5);
        Animal a1=new Animal("Lowly", "gray", 1,16);
        Animal[] animals={d1,c1,a1};
    }
}
