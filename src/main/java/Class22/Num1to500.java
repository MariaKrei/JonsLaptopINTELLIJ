package Class22;

import java.util.ArrayList;

public class Num1to500 {
    public static void main(String[] args) {


        ArrayList<Integer>  num=new ArrayList<>();
        for (int i = 0; i <=500 ; i+=2) {
          num.add(i);
        }System.out.println("List of even  numbers "+ num);
        for (int j = 0; j < num.size(); j++) {
            if (num.get(j)%5==0){
                num.remove(j);


} }
        System.out.println("Numbers after applied condition "+ num);}
}
/*



                }
            }
 */