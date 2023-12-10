package Class14;

public class LocalInstanceCat {
    String name="Kitti";
    void printName(){
      String name="Pishak"; //local variable has priority
        System.out.println(name);
    }

    public static void main(String[] args) {
        LocalInstanceCat c=new LocalInstanceCat();
        c.printName();
    }
}
