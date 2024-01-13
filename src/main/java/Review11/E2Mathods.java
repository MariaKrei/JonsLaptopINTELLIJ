package Review11;

import java.util.ArrayList;

public class E2Mathods {
    public static void main(String[] args) {
        ArrayList<Double> numbers=new ArrayList<>();
        numbers.add(15.0);
        numbers.add(25.0);
        numbers.add(30.0);
        numbers.add(35.0);
        numbers.remove(0); //remove ind0
        numbers.remove(25.0);
    }
}
