package Review5;

public class StringGoodStudentChangeName {
    public static void main(String[] args) {
        String[] students=new String[5];
        students[0]="Kendi";
        students[1]="Maria";
        students[2]="Eva";
        students[3]="Luke";
        students[4]="Karolina";
        for (int i=0; i<students.length; i++){
            if (students[i].equals("Eva")){
                students[i]="Good student";
            }
        }
        for (int i=0; i<students.length; i++){
            System.out.println(students[i]);
        }
    }
}
