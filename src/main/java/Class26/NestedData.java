package Class26;

import main.utils.Constants;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class NestedData {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream(Constants.EXCEL_FILE_PATH);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fis);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        int noOfActualRowsWithData=sheet.getPhysicalNumberOfRows();
        List<Map<String,String>> excelData=new LinkedList<>();
        Row headerRow=sheet.getRow(0);
        for (int i = 1; i <noOfActualRowsWithData ; i++) {
            Row currentRow=sheet.getRow(i);
            Map<String,String> rowMap=new LinkedHashMap<>();
            int noOfActualCells=currentRow.getPhysicalNumberOfCells();
            for (int j = 0; j <noOfActualCells ; j++) {
                String key=headerRow.getCell(j).toString();
                String values=currentRow.getCell(j).toString();
                rowMap.put(key,values);

            }

            excelData.add(rowMap);

            }


        }

    }
