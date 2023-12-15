package HomeWork;

public class HW146 {
    private String name;
    private String lastName;
    private int employeeID;
    private String startDate;
    private int salary;

    public HW146(String name, String lastName, int employeeID, String startDate, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.startDate = startDate;
        this.salary = salary;
    }
       /* public HW146(String name, String lastName,  String startDate,int employeeID, int salary) {
            this.name = name;
            this.lastName = lastName;
            this.employeeID =employeeID;
            this.startDate = startDate;
            this.salary = salary;}*/
    public HW146(){

    }

            public  void printInfo() {
                System.out.println(name + " " + lastName + " " + employeeID + " " + startDate + " " + salary);

        }



    public static void main(String[] args) {
        HW146 b=new HW146();
        b.printInfo();
        HW146 n=new HW146("Joe", "Smith", 12345, "01/01/1970", 35000);
n.printInfo();
       }
}