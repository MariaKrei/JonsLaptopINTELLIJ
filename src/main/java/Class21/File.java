package Class21;

public abstract class File {
    public abstract void open();
    public abstract void edit();
    public abstract void close();
    private String name;
    private int size;
    public File(String name, int size ){
        this.name=name;
        this.size=size;
    }
    public void printInfo(){
        System.out.println("name of the file is "+name+"and size is "+size);
    }
}
class JavaFile extends File{
    public JavaFile(String name, int size){
        super(name, size);
    }
    public void open(){
        System.out.println("Find a JavaFile and open it");
    };
    public  void edit(){
        System.out.println("Please make any changes");
    };
    public void close(){
        System.out.println("Please close a Java file");
    };

}
class PDFFile extends File{
    public PDFFile(String name, int size){
        super(name, size);
    }
    public void open(){
        System.out.println("Find a PDFFile and open it");
    };
    public  void edit(){
        System.out.println("Please make any changes in PDF File");
    };
    public void close(){
        System.out.println("Please close a PDF file");
    };
}
class Word extends File{
    public Word(String name, int size){
        super(name, size);
    }
    public void open(){
        System.out.println("Find a Word and open it");
    };
    public  void edit(){
        System.out.println("Please make any changes in Word File");
    };
    public void close(){
        System.out.println("Please close a Word file");
    };
}
