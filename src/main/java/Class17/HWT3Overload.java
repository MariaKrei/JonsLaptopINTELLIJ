package Class17;

public class HWT3Overload {
    static void add(int num1, int num2, double num3){
        System.out.println(num1+num2+num3);
    }
    static void add(int num1, double num2){
        System.out.println(num1+num2);
    }
    static void add(int num1, double num2, int num3){
        System.out.println(num1+num2+num3);
}}
 class HWT3OverloadTester{
    public static void main(String[] args) {
        HWT3Overload.add(10,10,11.5);
        HWT3Overload.add(10,9.5);
        HWT3Overload.add(15,22.5,8);
    }

        }
