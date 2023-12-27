package review9_1;

import Review9.Doctor;

public class Orthodontist extends Doctor {

        public Orthodontist(String firstName, String lastName, String speciality, int yearsOfExpierence){
            super(firstName, lastName, speciality, yearsOfExpierence);}

            public void printSpeciality(){
                System.out.println("I am"+speciality);
            }
    public void prescribeMedication(String medication){
        System.out.println(speciality+"prescribe medication to "+medication );

    }

}
