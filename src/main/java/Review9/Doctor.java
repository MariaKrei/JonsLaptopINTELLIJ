package Review9;

public class Doctor {
    public static String hospital;
    public String firstName, lastName;
    protected String speciality;
    int yearsOfExpierence;
    private double salary;
   public Doctor(String firstName, String lastName, String speciality, int yearsOfExpierence){
        this.firstName=firstName;
        this.lastName=lastName;
        this.speciality=speciality;
        this.yearsOfExpierence=yearsOfExpierence;
    }
     public static void work(){
         System.out.println("Doctor works at "+hospital);
     }
     protected void checkVitals(){
         System.out.println(firstName+" "+lastName+" check vitals on every patient");
     }
     //overloading is process when inside the same class we have method with the same name
    //how to obverload - by changing number of parameters or type or sequence
    //in overloading  method signature must be different
    //method signature - method name  and parameters
    //we dont care about return type
    void checkVitals(String patient){
        System.out.println(firstName+lastName+" check vitals on "+patient);

    }
    int checkVitals(String patient, int age){ ///overload
        System.out.println(firstName+" "+lastName+"checl vitals om "+patient);
    return 0;}

    //overriding- in subclass in parent class we have name with the same name
   //how to override - we need inheritance, we must keep the same name , parameters and return type
    //method signature must be the same
    //acces modifiers must be the same or have wider access

    public void prescribeMedication(String medication){
        System.out.println("surgeon"+lastName+"prescribe medication to "+medication );

    }


    }


class Surgeon extends Doctor{
    String location;
    Surgeon (String firstName, String lastName, String speciality, int yearsOfExpierence , String location){

        super(firstName, lastName, speciality, yearsOfExpierence);
        this.location=location;


        }
    public void prescribeMedication(String patient){
        System.out.println("surgeon"+lastName+"prescribe medication to "+patient );
    }

}


