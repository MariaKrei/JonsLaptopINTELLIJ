package Class15;

public class JavaConstructor {
   private String LanguageName;
   private int expierence;
   private char grade;

    JavaConstructor(String pLanguageName, int pExpierence,char pGrade){
        LanguageName=pLanguageName;
        expierence=pExpierence;
        grade=pGrade;
        System.out.println(LanguageName+expierence);
    }

    JavaConstructor(){
        System.out.println("Empty");
    }
}
