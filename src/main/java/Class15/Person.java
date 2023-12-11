package Class15;

public class Person {
    private String name;
    private int age;
    private double weight;
    private double salary;
    private String favPLanguage;

   public Person(String PName,  int pAge,int  pWeight ,double pSalary, String PfavPLanguage) {
       name = PName;
       age = pAge;
       weight = pWeight;
       salary = pSalary;
       favPLanguage = PfavPLanguage;
       System.out.println(name+age+weight+salary+favPLanguage);
   }
        public Person(String PName, int pAge,int  pWeight ,double pSalary) {
            name = PName;
            age = pAge;
            weight = pWeight;
            salary = pSalary;
            System.out.println(name+age+weight+salary);
        }

       }



