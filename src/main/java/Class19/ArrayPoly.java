package Class19;

public class ArrayPoly {
    public static void main(String[] args) {
        Dog d1=new Dog("Amelia", "brown", 5,50);
        Dog d2=new Dog("Ike", "white/black", 4,45);
        Cat c1=new Cat("Kitty", "White", 2,10);
        Animal a1= new Animal("Gerry", "Gray", 1,5);
        Animal []  arr={d1,d2,c1,a1};
        Animal a2=arr[0];
        Dog d5=(Dog)arr[1];
        a2.printInfo();
        d5.printInfo();
        Animal animal=arr[0];
        animal.printInfo();
Animal n=arr[3];
        n.printInfo();
        Cat c=(Cat)arr[2];
        c.printInfo();

    }
}
