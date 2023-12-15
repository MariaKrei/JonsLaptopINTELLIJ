package Class17;

public class Programming {
    public Programming(){
        System.out.println("I love programming language");
    }
    public Programming(String word){
        System.out.println("I love "+word);
    }}
class ProgrammingTester{

    public static void main(String[] args) {
        Programming p1=new Programming();
        Programming p2=new Programming("Python");

    }

}