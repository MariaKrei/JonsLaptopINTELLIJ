package Class17;

public class HWPrivate {
    private void add(String name, String lastName){
        System.out.println(name+" "+ lastName);
    }
    private void add(String name,  int number){
        System.out.println(name+" "+number);
    }
    private void add(double age,  int number){
        System.out.println(age+" "+number);
    }

    public static void main(String[] args) {
        HWPrivate n=new HWPrivate();
        n.add("Maria", "Krei");
        n.add("Maria", 10);
        n.add(10.5, 20 );
    }
}
