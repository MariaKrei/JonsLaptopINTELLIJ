package Class16;

public class TeacherTester {
    public static void main(String[] args) {
       Teachers t=new Teachers();
       t.getGift();

       MathTeacher mt=new MathTeacher();
       mt.getFood();
       mt.teachMath();
       mt.getSalary();
       mt.name="Maria";

       PianoTeacher pt=new PianoTeacher();
       pt.drink() ;
       pt.hours=10;
       pt.getFood();




    }
}
