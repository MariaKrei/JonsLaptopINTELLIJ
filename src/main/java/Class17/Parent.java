package Class17;
class GrandParent{
    GrandParent(){
        System.out.println("GrandPa just came to life");
    }
}
public class Parent extends GrandParent {
    String name="Israel";
    Parent(){
        System.out.println("Parent is born");
    }
}
class Child extends Parent {
    String name = "Maria";
    Child(){
        System.out.println("Child is born");
    }

    void print() {
        System.out.println(super.name); //this keywo
    }
}

    class Tester{
        public static void main(String[] args) {


        Child c=new Child();
        c.print();
    }}