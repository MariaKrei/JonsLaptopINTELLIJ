package Class25;

import main.utils.ConfigReader;

import java.io.IOException;

public class E2FileHandlingMethod {
    public static void main(String[] args) throws IOException {
        //static method and we dont need object
       String value= ConfigReader.read("browser");
        String value2= ConfigReader.read("password");

        System.out.println(value+" "+value2);
    }
}
