package Class2;

import java.sql.SQLOutput;

public class E4Concat {
    public static void main(String[] args) {
        //process of combining of 2 strings together
        //we cannot use variable if we not created it first
        //Java is case-sensitive  meaning for Java fname, Fname, fName  are all different

        String fName="Krei";
                String lName="Maria";
                String space=" ";
        System.out.println(fName+space+lName);
        System.out.println(fName+" "+lName);
        System.out.println("Krei"+" "+"Maria");
    }
}
