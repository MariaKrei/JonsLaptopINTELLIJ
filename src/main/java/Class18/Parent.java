package Class18;

public class Parent {
     void marry(){
        System.out.println("Marry the girl that we have selected for you");
    }
    void sleep(){
        System.out.println("ZZZZ");
    }
}
class Karimi extends Parent{
void marry(){
    System.out.println("I want to marry Scarlett Johanson");
}
}
class Tester{
    public static void main(String[] args) {
        Karimi n=new Karimi();
        n.marry();
        n.sleep();
    }
}