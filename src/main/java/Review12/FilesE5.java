package Review12;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FilesE5 {
    public static void main(String[] args) throws IOException {
        //location
        String path="C:\\Users\\john\\IdeaProjects\\sDetJAVAb18\\Files\\Config.properties";
        //bringing the file to the memory ram
        FileInputStream fis=new FileInputStream(path);

        //properties files work on;y with key value v
        Properties properties=new Properties();
        properties.load(fis);
        System.out.println(properties.getProperty("url"));
    }
}
