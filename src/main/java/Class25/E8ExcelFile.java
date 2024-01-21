package Class25;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E8ExcelFile {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\john\\IdeaProjects\\sDetJAVAb18\\Files\\Batch18.xlsx";
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook excel=new XSSFWorkbook(fis);
        var sheet=excel.getSheet("Sheet1");
        //method count num of rows
        int noOfRows=sheet.getPhysicalNumberOfRows();

        List<Map<String,String>> excelData=new ArrayList<>();
        Row header=sheet.getRow(0); //extract row
        for (int i = 1; i <noOfRows ; i++) { //row0 we nee need to use in loop
            Row row= sheet.getRow(i);
            Map<String,String> rowData=new LinkedHashMap<>();
            int noOfColumn=row.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfColumn; j++) {
                String key=header.getCell(j).toString();
                String value=row.getCell(j).toString();
                rowData.put(key, value);

            }
            excelData.add(rowData);

        }
        System.out.println(excelData);
    }
}
