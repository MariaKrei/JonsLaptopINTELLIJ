package Class26;

import main.utils.Constants;
import main.utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class RowsFromMethods3loops {
    public static void main(String[] args) throws IOException {
        List<Map<String,String>> data= ExcelReader.read(Constants.EXCEL_FILE_PATH, "Sheet1");
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(3).get("LastName"));
        //write code to print all the info from this excel use Read method from ExcelReader
       // data.forEach(x-> System.out.println(x));
//print individidual rows
        data.forEach(x->x.forEach((k,v)->{
            System.out.println(k+" "+v);

        }));
       // for (int i = 0; i <data.size() ; i++) {
        //    System.out.println(data.get(i));
//symplified lambda
        data.forEach(System.out::println);
        }
    }

