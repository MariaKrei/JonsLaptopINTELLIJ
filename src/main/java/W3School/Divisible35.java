package W3School;

public class Divisible35 {
    public static void main (String[] args){
        /*Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.*/

        for (int i = 1; i <=100; i++) {
            if (i%3==0) {
                System.out.println("Numbers dixisible by 3" + i);

            }
            for (int j = 0; j <=100; j++) {
                if (i%5==0) {
                    System.out.println("Numbers dixisible by 5" + i);
            }
                for (int k = 0; k <=100 ; k++) {
                    if (i%3==0&&i%5==0){
                        System.out.println("Num divisible by 3 and 5");
                    }

                }System.out.println("nnn");
            }


        }
    }
}
