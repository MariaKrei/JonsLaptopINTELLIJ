package Class26;

import main.utils.Constants;
import main.utils.ExcelReader;

import java.io.IOException;

public class ReadDataWithMethod {
    public static void main(String[] args) throws IOException {

        System.out.println(ExcelReader.read(Constants.EXCEL_FILE_PATH,"Sheet1"));
    }
}
