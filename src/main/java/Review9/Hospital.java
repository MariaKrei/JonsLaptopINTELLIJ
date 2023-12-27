package Review9;

import review9_1.Orthodontist;

public class Hospital {
    public static void main(String[] args) {
        Doctor.hospital="Inova";
       Surgeon surgeon= new Surgeon ("John", "Doe", "Surgeon", 20, "Saint Louis");
        surgeon.checkVitals();
        surgeon.checkVitals("Jain Smith"); //parent class
        surgeon.prescribeMedication("Smith"); //child class
        Doctor.work(); //static method from parent class
        Surgeon.work(); //static method from child class

        Orthodontist ortho=new Orthodontist ("Josh", "Smith", "Orthodontist",20);
Orthodontist.work();
ortho.checkVitals();
ortho.prescribeMedication("Pain Killer");
ortho.printSpeciality();

Doctor ortho1=new Orthodontist("Josh", "Smith", "Orthodontist", 20);
ortho1.checkVitals();
ortho1.checkVitals("Michael");
ortho1.prescribeMedication("Pills");

        Doctor sur= new Surgeon ("John", "Doe", "Surgeon", 20, "Saint Louis");
       sur.checkVitals();
       sur.checkVitals("Mohammed");
       sur.prescribeMedication("pills");

    }

}
