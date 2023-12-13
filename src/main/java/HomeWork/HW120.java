package HomeWork;

public class HW120 {
    int year;
    String school;
    int batch;
    void printAll(){
        System.out.println("I am a student of batch "+batch+ " studying at "+school+" in the year of "+year);
    }

    public static void main(String[] args) {
        HW120 n=new HW120();
n.year=2024;
n.batch=18;
n.school="Syntax";
n.printAll();
    }
}
