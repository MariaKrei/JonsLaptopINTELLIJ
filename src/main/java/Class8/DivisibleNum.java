package Class8;

public class DivisibleNum {
    public static void main(String[] args) {
        int[] numbers={27,48,28,14,26,57,100,99,34,15,7,2};
        int div3=0, div5=0;
        for (int x:numbers){

        if (x%5==0){
            div5++;
        }
        if (x%3==0){
            div3++;
        }

    }
        System.out.println("There are "+div3+" number divided by 3");
        System.out.println("There are "+div5+" number divided by 5");
}}
