package Review10;

public class PlyTester {
    public static void main(String[] args) {
        Cat c = new Cat("Mini", "gray", 10);
        Dog d = new Dog("Amelia", "brown", 5, 55);
        Animal[] animals = {c, d};
        for (Animal a : animals) {
            a.printInfo();
            a.eat();
            a.speak();
            String r = a.getName(); //void cannot be in sout, only return type should be in sout
            System.out.println(r);

        }




        //specific method only from one class
        //upcasting
        Animal a=animals[1];
       // ((Dog)a).run();  //upcasting
        //or downcasting
        Dog d2=(Dog)a;
        d2.run();
Animal b=animals[0];
        Cat c2=(Cat)b;
        c2.play();
        System.out.println(c2.lastName("Krei"));


    }}

