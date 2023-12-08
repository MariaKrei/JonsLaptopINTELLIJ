package Review7;

public class person {
    String name;
    int age;
    double weight;
    double heigth;
    void eat(){
            System.out.println("Can eat something yummy");
        }
        String getName(){
            return name;
        }

    public static void main(String[] args) {
       person p=new person();
    p.name="Maria";
            p.age=22;
    p.heigth=5.4;
    p.eat();
    String name=p.getName();

    }}


