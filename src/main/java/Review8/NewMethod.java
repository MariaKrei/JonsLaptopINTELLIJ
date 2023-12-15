package Review8;

public class NewMethod {
    void print(){
        System.out.println("Hello there");
    }

    public static void main(String[] args) {
       new NewMethod().print();
       //or
      NewMethod c= new NewMethod();
      c.print();
      String str=new String("Java");
      str.toLowerCase();
    }
}
