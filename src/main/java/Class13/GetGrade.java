package Class13;

public class GetGrade {
    char getGrades (int x){

        if (x>90){
            return'A';
        }else if (x>80&&x<=90){
            return'B';
        }else if (x>70&&x<=80){
            return 'C';

        }else if (x>50&&x<=70){
            return 'D';
        }else{
            return 'F';
        }

    }}


