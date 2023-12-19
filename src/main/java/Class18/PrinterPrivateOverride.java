package Class18;

public class PrinterPrivateOverride {
    private void print(){
        System.out.println("Hello");
    }
    private void print(String word){
        System.out.println(word);
    }

    public static void main(String[] args) {
        PrinterPrivateOverride p=new PrinterPrivateOverride();
        p.print();
        p.print("Java");
    }
}
