package HomeWork;

public class HW118 {

    public String spaceOut(String name) {

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");





    }
        System.out.println();
        return name;
    }

    public static void main(String[] args) {
        HW118 n=new HW118();
        n.spaceOut("Hello");
        HW118 b=new HW118();
        b.spaceOut("technology");
    }}




