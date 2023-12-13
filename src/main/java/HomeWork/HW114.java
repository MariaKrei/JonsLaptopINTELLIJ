package HomeWork;

public class HW114 {
    int multipl(int a, int b){
        return a*b;

    } int add(int a, int b){
        return a+b;
    } int substr(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        HW114 n=new HW114();



        System.out.println("Addition "+n.add(25,5));
        System.out.println("Multiplication " +n.multipl(10,3));
        System.out.println("Substraction " +n.substr(30,10));

    }
}
