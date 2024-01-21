package Class25;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExtractAllDataFrExcell {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\john\\IdeaProjects\\sDetJAVAb18\\Files\\Batch18.xlsx";
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook excel=new XSSFWorkbook(fis);
        var sheet=excel.getSheet("Sheet1");
        //method count num of rows
        int noOfRows=sheet.getPhysicalNumberOfRows();
        for (int i = 0; i <noOfRows ; i++) {
            Row row=sheet.getRow(i);
            int noOfColumns=row.getPhysicalNumberOfCells();
            for (int j = 0; j <noOfColumns ; j++) {
                System.out.print(row.getCell(j)+" ");

            } System.out.println(" ");

        }

    }
}
