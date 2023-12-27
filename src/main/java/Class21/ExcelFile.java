package Class21;
//Created by Microsoft


interface FileReader{
    void read();
}
public class ExcelFile implements FileReader{
   public  void read(){
        System.out.println("REading Excel file");
    }
}
class TxtFile implements FileReader{
    public void read(){
        System.out.println("Reading Text File ");
    }
}
