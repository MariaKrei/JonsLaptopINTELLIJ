package HomeWork;

public class HW124 {

private String welcome;
    public  HW124(String welcome) {
        this.welcome = welcome;
        System.out.println(welcome);
    }

    String callName(String name){
        System.out.println("Welcome To Syntax Technologies");
        return name;


    }
    public static void main(String[] args) {


        String s="Welcome To Syntax Technologies";
        System.out.println(s);
        HW124 b=new HW124("Welcome to Syntax Technologies");
        b.callName("Welcome to Syntax Technologies");




    } }
