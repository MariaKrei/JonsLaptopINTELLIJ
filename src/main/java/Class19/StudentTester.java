package Class19;

public class StudentTester {
    public static void main(String[] args) {
        Student[] arr={new Student(),new SyntaxStudent(), new CollegeStudent(),new SchoolStudent()};
        for (int i = 0; i < arr.length; i++) {
            Student averageStudent=arr[i];

            averageStudent.doProject();
            averageStudent.havingHoliday();
            averageStudent.learning();
            if (averageStudent instanceof SyntaxStudent){
                SyntaxStudent s=(SyntaxStudent)averageStudent;
                s.getRest();}
                if (averageStudent instanceof CollegeStudent){
                    CollegeStudent c=(CollegeStudent)averageStudent;
                    c.haveFun();}
                if (averageStudent instanceof SchoolStudent){
                    SchoolStudent sc=(SchoolStudent)averageStudent;
                    sc.goToOcean();}


                }
            }


        }

