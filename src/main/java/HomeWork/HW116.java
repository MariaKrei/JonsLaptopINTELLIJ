package HomeWork;

public class HW116 {
    int num1;
    int num2;
    boolean even(int num1, int num2) {
        if (num1 % 2 == 0 && num2 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        HW116 n = new HW116();

        System.out.println(n.even(10, 21));
    }}

