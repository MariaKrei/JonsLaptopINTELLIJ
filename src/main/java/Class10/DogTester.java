package Class10;

public class DogTester {
    public static void main(String[] args) {
        //creating an object of the class
   Dog dog1=new Dog();
   /* dog is data type
   dog1 is variable that holds the object
   new Dog() - is creating the object of Dog class
    */
        dog1.name="Amelia";
        dog1.breed="Chesapeake";
        dog1.age=4;
        dog1.color="Brown";
        dog1.bark();
        dog1.bark();

        System.out.println(dog1.name);
       dog1.sleep();

       Dog dog2=new Dog()
;
    dog2.name="Ike";
    dog2.color="white and black";
    dog2.breed="English setter";
    dog2.weight=8;
        System.out.println(dog2.name);
        System.out.println(dog2.color);
        dog2.eat();
        dog2.sleep();
}}
