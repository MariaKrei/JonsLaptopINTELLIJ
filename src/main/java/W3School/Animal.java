package W3School;

public  class Animal {
    /*Write a Java program to create a class called Animal with a method called makeSound().
     Create a subclass called Cat that overrides the makeSound() method to bark.*/
    public void makeSound(){
        System.out.println("animal sounds");
    };
}
class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Bark bark");
    }
}
class AnamalTester{
    public static void main(String[] args){

        Animal a=new Animal();
        a.makeSound();
        Cat c=new Cat();
        c.makeSound();

    }
}