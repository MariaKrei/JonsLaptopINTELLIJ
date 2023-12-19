package Class18;

public class Degree {
    public void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma ");
    }
}
class Bachelors extends Degree{}

class Masters extends Degree{
    public void getPrerequisite(){
        System.out.println("Get prerequisite after you get a school diploma");
    }
}
