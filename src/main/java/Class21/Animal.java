package Class21;

public abstract class Animal {
    private String name;
    private String color;
    public abstract void eat ();
    public Animal(String name,String color){
        this.name=name;
        this.color=color;
    }
    public abstract  void sleep ();
    void speak(){
        System.out.println("Animal speek");
    }
    public void printInfo(){
        System.out.println(name+" "+color);
    }
}
class Dog extends Animal{
    public Dog(String name, String color) {
        super(name, color);
    }

    public void eat (){
        System.out.println("Dogs like to eat meat");
    }
    void speak(){
        System.out.println("wuff wuff ");
    }
    public void sleep(){
        System.out.println("ZZZZZ");
    }
}
class Cat extends Animal{
    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("Cat likes to eat fish");
    }
    void speak(){
        System.out.println("meow meow ");
    }
    public void sleep(){
        System.out.println("ZZZZZ");
    }
}