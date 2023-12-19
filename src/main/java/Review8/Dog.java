package Review8;

public class Dog {
    private String name;
    private String color;
    private int age;
    private double weight;
    public Dog(String name, String color, int age, double weight){
        this.name=name;
        this.age=age;
        this.color=color;
        this.weight=weight;
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
}
