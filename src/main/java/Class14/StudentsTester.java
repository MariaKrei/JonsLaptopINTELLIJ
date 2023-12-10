package Class14;

public class StudentsTester {
    public static void main(String[] args) {
        Students a=new Students();
        a.name="Maria";
        a.id=12345;
       Students.NS++;

        Students b=new Students();
        a.name="Marina";
        a.id=23456;
        Students.NS++;

        Students c=new Students();
        a.name="Mago";
        a.id=345678;
        Students.NS++;
        System.out.println("Number of students are "+Students.NS);

    }
}
