package Class4;

public class Num {
    public static void main(String[] args) {
        int num1=300, num2=200, num3=100;
        if (num1>num2){
            if (num1>num3){
                System.out.println("Num1 is largest "+num2);

            }
        }else{
            if (num2>num3){
                System.out.println("num2 is largest "+num2);
            }else{
                System.out.println("Num3 is largest "+num3);
            }

        }
    }
}
