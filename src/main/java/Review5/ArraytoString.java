package Review5;

import java.util.Arrays;

public class ArraytoString {
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
    }//if we want to print only items
        System.out.println(Arrays.toString(students));
    }}

