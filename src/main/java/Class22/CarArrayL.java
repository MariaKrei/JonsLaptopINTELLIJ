package Class22;

import java.util.ArrayList;

public class CarArrayL {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("Cadillac");
        cars.add("GMC");
        cars.add("Mercedes");
        System.out.println(cars);
        for (int i = 0; i <cars.size() ; i++) {
            System.out.println(cars.get(i));
        }

        }
}
