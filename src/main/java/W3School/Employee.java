package W3School;

public  class Employee {
    private String name;
        private String address;
        private double salary;
        private String jobTitle;
        private double yearsOfExpierence;
        public Employee(String name,String address, int salary, String jobTitle, double yearsOfExpierence){
            this.name=name;
            this.address=address;
            this.salary=salary;
            this.jobTitle=jobTitle;
            this.yearsOfExpierence=yearsOfExpierence;
        }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    public String getJobTitle() {
        return jobTitle;
    }
    public double getYearsOfExpierence(){
            return yearsOfExpierence;
    }

    public  double calculateBonus(){
            return 0;
    }
public void PrintInfo(){
    System.out.println(jobTitle+name+ address+"with salary "+salary);
}
public void generateReport(){
            System.out.println(jobTitle+name+"generates report");
}}
    class Manager extends Employee{
    double yearsOfExpierense;
        public Manager(String name,String address, int salary, String jobTitle, double yearsOfExpierense){
            super(name, address, salary, jobTitle,yearsOfExpierense);
        }
        public double calculateBonus(){
            if (getYearsOfExpierence()>=10){
                double bonus=getSalary()+((getSalary()/100)*50);
                System.out.println("Your bonus is "+bonus);
                return bonus;
            }else{
                double bonus1=getSalary()+((getSalary()/100)*50);
                System.out.println("Your bonus is "+bonus1);
                return bonus1;
            }

    }
public void managingReport(){
            System.out.println("generating reports");
}}
    class Developer extends Employee{

        public Developer(String name,String address, int salary, String jobTitle, double yearsOfExpierense){
            super(name, address, salary, jobTitle,yearsOfExpierense);
        }
        public double calculateBonus(){
            if (getYearsOfExpierence()>=10){
                double bonus=getSalary()+((getSalary()/100)*50);
                System.out.println("Your salary with bonus is "+bonus);
                return bonus;
            }else{
                double bonus1=getSalary()+((getSalary()/100)*50);
                System.out.println("Your salary with  bonus is "+bonus1);
                return bonus1;
            }

    }}
    class Programmer extends Employee{

        public Programmer (String name,String address, int salary, String jobTitle,double yearsOfExpierense){
            super(name, address, salary, jobTitle,yearsOfExpierense);
        }
        public double calculateBonus(){
            if (getYearsOfExpierence()>=10){
                double bonus=getSalary()+((getSalary()/100)*50);
                System.out.println("Your bonus is "+bonus);
                return bonus;
            }else{
                double bonus1=getSalary()+((getSalary()/100)*50);
                System.out.println("Your salary with bonus  is "+bonus1);
                return bonus1;
            }
    }}
class EmployeeTester{
    public static void main(String [] arg){
        Employee[] arr={new Developer("Maria", "SunnyValley strt", 190000, "Tester",5),
                new Manager("John", "Sunny road", 300000, "Manager",10),
                new Programmer("Eva ","SunnyValley", 190000,"programmer",5)};
        for (Employee a:arr){

            a.calculateBonus();
            a.PrintInfo();


        }Manager m=new Manager("John", "Marryballey",250000, "manager", 5);
        m.managingReport();
    }
}
