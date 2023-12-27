package Review9;

import review9_1.Orthodontist;

public class EmergencyRoom {
    public static void main(String[] args) {


 Doctor[] doc=  {new Surgeon ("Maria", "Kr", "Surgeon", 15, "Saint Louis"),
    new Surgeon ("John", "Kr", "NeuroSurgeon", 20, "Miami"),
    new Orthodontist("Poly", "Seymore", "Orthodontist", 20)};
    doc[0].checkVitals();
    doc[0].checkVitals("jane");
    doc[0].prescribeMedication("pills");
        for (int i = 0; i < doc.length; i++) {
            doc[i].checkVitals();
            doc[i].checkVitals("jane");
            doc[i].prescribeMedication("pills");
            System.out.println("____________");

        }
        System.out.println("Enhance loop");
        for ( Doctor doctorishka :doc){
            doctorishka.checkVitals();
            doctorishka.checkVitals("Jack");
            doctorishka.prescribeMedication("pills");
        }
}}
