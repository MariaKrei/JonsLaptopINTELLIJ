package HomeWork;

public class HW113 {
    int numbers;
    int min;

    void clock(int hours, int min) {

        System.out.println(hours + ":" + min);

    }


    public static void main(String[] args) {
        HW113 n=new HW113();
        n.clock(10,23);
    }

}