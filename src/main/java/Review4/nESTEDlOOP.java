package Review4;

public class nESTEDlOOP {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {  //outter loop
            System.out.println("Hello");
            for (int j = 1; j < 3; j++) {  //inner loop
                System.out.println("Bye");
            }
        }
        System.out.println("-----------------");
        //outer loop is infinite
        for (int i = 1; i <= 3; i-- ){  //outter loop
            System.out.println("Hello");
            for (int j = 1; j >3; j++) {  //inner loop
                System.out.println("Bye");
            }
        }
        System.out.println("-----------------");
        for (int i = 1; i <= 3; i--) {  //outter loop
            System.out.println("Hello");
            for (int j = 1; j <3; j++) {  //inner loop
                System.out.println("Bye");

    }}}}