package Class8;

public class NewT2 {
    public static void main(String[] args) {
        int[] numbers={10,15,20,18,9,60,22,30};
        int sumOdd=0, sumEven=0;
        for (int num:numbers){
            if(num%2==0){
                sumEven=sumEven+num;
            }else{
                sumOdd=sumOdd+num;
            }

        }
        System.out.println("Sum of even numbers is "+sumEven);
        System.out.println("Sum of odd numbers is "+sumOdd);


        }}



