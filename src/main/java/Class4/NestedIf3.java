package Class4;

public class NestedIf3 {
    public static void main(String[] args) {
        double budget=80000;
        String engineType="petrol";
        if (budget>=50000){
            if (engineType.equals("electric")) {
                System.out.println("Buy a Tesla");
            }else if (engineType.equals("Hybrid")) {
                System.out.println("I want to buy toyota");
            }else{
                System.out.println("I want to buy porche");
            }
        }else if (budget>=30000){
            if (engineType.equals("electric")) {
                System.out.println("Buy a BYD");
            }else if (engineType.equals("Hybrid")) {
                System.out.println("Buy Camry");
            }else{
                System.out.println("buy sonata");
            }
        }else if (budget>=20000){
            if (engineType.equals("electric")) {
                System.out.println("buy nissan");
            }else if (engineType.equals("Hybrid")) {
                System.out.println("KIa");
            }else {
                System.out.println("Honda");
            }
            }else {
            System.out.println("lets save more");
        }
    }
}
