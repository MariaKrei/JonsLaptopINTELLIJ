package Class25;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFileReader {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\john\\IdeaProjects\\sDetJAVAb18\\Files\\Batch18.xlsx";
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook excel= new XSSFWorkbook(fis);
        //to access sheet from the file
        Sheet sheet=excel.getSheet("Sheet1");
        //to access row
        Row row0=sheet.getRow(1);
        //to acess column
        Cell cell1=row0.getCell(1);
        System.out.println(cell1);
    }
}
