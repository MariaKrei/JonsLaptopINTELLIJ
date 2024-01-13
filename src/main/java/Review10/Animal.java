package Review10;

public abstract class  Animal {
   private String name;
   private  String color;
   private  int age;
    public Animal(String name, String color, int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
   public  abstract void  eat();
  public  abstract  void  speak();
   public  String getName() {
    return name;
    }
    public void printInfo(){
        System.out.println(name+" "+color+" "+age);
    }
}
class Dog extends Animal{
    private int weigth;
    public Dog(String name, String color, int age, int weigth){

        super(name,color,age);
        this.weigth=weigth;

    }
    void run(){
        System.out.println("dog running");
    }

    @Override
    public void eat() {
        System.out.println("Dogs love bones ");
    }

    @Override
    public void speak() {
        System.out.println("bark bark bark");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("and her weigth is "+weigth);
    }

}

class Cat extends Animal{
     String breed;
    public Cat(String name, String color, int age){
        super(name, color,age);
    }

public void play(){
    System.out.println("Play play play toys");
}
    @Override
    public void eat() {
        System.out.println("love fish");
    }

    @Override
    public void speak() {
        System.out.println("meow meow");

    }
    public String lastName(String lName){
        return lName;
    }
}
