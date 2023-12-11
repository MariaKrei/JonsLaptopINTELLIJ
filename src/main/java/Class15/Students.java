package Class15;

public class Students {
   private String name;
   private double gradeMath;
   private double gradeEng;
   private double gradeHis;

  public Students(String sName, int sGradeMath, int sGradeEng, int sGradeHis ){
     name=sName;
     gradeMath=sGradeMath;
     gradeEng=sGradeEng;
     gradeHis=sGradeHis;
       System.out.println(name+" "+gradeMath+" "+gradeEng+" "+gradeHis);

   } public void averageGrade(){
        System.out.println(name+(gradeEng+gradeMath+gradeHis)/3);

    }
}
