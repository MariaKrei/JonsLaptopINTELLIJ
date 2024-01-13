package Class23;

import java.util.HashSet;

public class StudentTester {
    public static void main(String[] args) {
        HashSet<Students> students =new HashSet<>();
        students.add(new Students("Engin", "123"));
        students.add(new Students("Mary", "124"));
        students.add(new Students("Marisha", "125"));
        for (Students s:students){
            s.printInfo();
        }


    }
}
