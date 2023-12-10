package Class14;

public class InstanceDog {
    String name;
    void printInfo(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        InstanceDog d1=new InstanceDog();
        d1.name="Jack";
        d1.printInfo();
    }
}
