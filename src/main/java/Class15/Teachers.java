package Class15;

public class Teachers {
    private String name;
    private String address;
    private int age;


    Teachers(String name, String address){
        this.name=name;
        this.address=address;
    }
    public Teachers(String name, String address, int age) {
        this.name=name;
        this.age = age;
        this.address=address;
    }

    public void displayInfo(){
        System.out.println(name+" "+address);
    }


    public static void main(String[] args) {
        Teachers a=new Teachers("Maria K", "10 Pond ct");
        a.displayInfo();
        Teachers b=new Teachers("Lera", "10 Pond ct");
        b.displayInfo();
        Teachers c=new Teachers("Lera", "10 Pond ct", 25);
        b.displayInfo();

    }
}
