package Class13;

public class Prime {
    boolean isPrime (int num) {
        if (num<=1){
            return false;
        }
        for (int i = 2; i <=num/2; i++) {
            if (num%i==0){
                return false;
            }

        }
return true;
    }}