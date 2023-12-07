package Class1;

public class StringsConcat {
    public static void main(String[] args) {
        String houseNo="H3295";
        String streetNo="Abc123";
        String state="New York";
        String country="USA";
        String completeAddress=houseNo+streetNo+state+country;
        String space=" ";
        System.out.println(houseNo+space+streetNo);
        System.out.println(houseNo+" "+country);
        System.out.println(completeAddress);
    }
}
