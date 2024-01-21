package Class25;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class REtriveInfoFromConfig {
    public static void main(String[] args) throws IOException {
        //a variable to hold a location of the file ]]
        String path="C:\\Users\\john\\IdeaProjects\\sDetJAVAb18\\Files\\Config.properties";
        //navigate to this location
        FileInputStream fis=new FileInputStream(path);
        //this bis the special claaa that knows how to read write data from properties file
        Properties properties=new Properties();
        properties.load(fis);
        System.out.println(properties.getProperty("userName"));

    }
}
