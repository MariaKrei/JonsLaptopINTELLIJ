package Review9;

public abstract class Computer {
    //abstruct means something is incomplete
    public static String type; //non  access mkodifier
    //final - this variable cannot be change, completed, cannot be inheritated
   public  String name;
    public int memory;
    String color;
   public  Computer(String name, int memory, String color){
        this.name=name;
        this.memory=memory;
        this.color=color;
    }
    public static void playSong(){
        System.out.println("I can play music on my"+type);
    }
    protected void printInfo(){
        System.out.println("i HAVE "+name +"computer with "+memory);

    }
   abstract void executeCode();
   abstract void readEmails();
}
class Apple extends Computer{
    public Apple(String name, int memory, String color){
        super(name,memory, color);
    }
    //when we provide inplementation to abstract classes we MUST follow rules of Overriding!!!
    //rules of overriding: same method name, same parameters MUST be the same- method signature. return type must be the same.
    // Acces modifier must be the same or wider.
    // we cannot create object of abstract class
     void executeCode(){
         System.out.println("Execute code on "+type+" "+name);
     }
     public void readEmails(){
         System.out.println(name+"can read my email");
     }
}



