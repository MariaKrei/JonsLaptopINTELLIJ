package Class21;

public class FileTester {
    public static void main(String[] args) {


    File[] arr={new JavaFile("Maria", 15), new PDFFile("John", 25), new Word("Eva",9)};
    for (File myArr:arr){
        myArr.printInfo();
        myArr.open();
        myArr.edit();
        myArr.close();
    }
}}
