package Class18;

public class Animal {
    String name;
    String color;
    int age;
    double weight;

    public Animal(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    public void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
    public void speak(){
        System.out.println("Animal speaking");
    }
    public void sleep(){
        System.out.println("ZZZZZZ");
    }
}
class Dog extends Animal{
    public Dog(String a, String b, int c, double d) {

        super(a,b,c,d);
    }
    public void speak(){
        System.out.println("woof woof");
    }
   /* void demo(String str){
        System.out.println(str);
        printLength(str);
    }
    void printLength(String word){
        System.out.println(word.length());
    }*/
}

