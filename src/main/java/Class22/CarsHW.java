package Class22;

import java.util.ArrayList;

public class CarsHW {public static void main(String[] args) {
    ArrayList<String> cars=new ArrayList<>();
    cars.add("Mercedes");
    cars.add("Cadillac");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Rollse Royce");
    System.out.println(cars);

    for (int i = 0; i < cars.size(); i++) {
        System.out.println(cars.get(i));
    }
for (String a:cars){
    System.out.println(a);
}

}}
