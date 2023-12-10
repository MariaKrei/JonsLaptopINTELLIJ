package Class14;

public class SyntaxEmployeeTesterStatic {
    public static void main(String[] args) {


    SyntaxEmployee n=new SyntaxEmployee();
    n.salary=10000;
    n.empID=123;
    System.out.println(n.empID+" salary is "+n.salary+"name of the CEO is " +SyntaxEmployee.ceo);

    SyntaxEmployee n2= new SyntaxEmployee();
    n2.salary=12000;
    n2.empID=3456;
        System.out.println(n2.empID+" salary is "+n2.salary+"name of the CEO is " +SyntaxEmployee.ceo);
}
}