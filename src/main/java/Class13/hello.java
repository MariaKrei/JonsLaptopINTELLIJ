package Class13;

public class hello {
    void sayHello (String x){
        if (x.equalsIgnoreCase("Spain")){
            System.out.println("Hola");
        }else if (x.equalsIgnoreCase("Russia")){
            System.out.println("Privet");
        }else if (x.equalsIgnoreCase("USA")){
            System.out.println("Hello");
        }else if (x.equalsIgnoreCase("Turkey")){
            System.out.println("Merhaba");
        }else{
            System.out.println("No hello for you");
        }
    }
}
