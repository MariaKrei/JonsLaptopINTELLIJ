package Class19;

public class Student {
    public void learning(){
        System.out.println("Study and study");
    }
    public void doProject(){
        System.out.println("Do project");
    }
    public void havingHoliday(){
        System.out.println("Having holiday");
    }
}
class SyntaxStudent extends Student{
    public void learning(){
        System.out.println("Learning java");
    }
    public void getRest(){
        System.out.println("Tired, get rest");
    }

}
class CollegeStudent extends Student{
    public void learning(){
        System.out.println("Learning something new today");}
        public void haveFun(){
            System.out.println("Go to zoo");
        }
}
class SchoolStudent extends Student{
    public void learning(){
        System.out.println("Easy lessons");}
    public void goToOcean(){
        super.doProject();
        System.out.println("Get rest after");

    }

}
