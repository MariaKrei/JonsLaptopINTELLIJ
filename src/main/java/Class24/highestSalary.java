package Class24;

import java.util.*;

public class highestSalary {
    public static void main(String[] args) {
        Map<String, Double> employee=new LinkedHashMap<>();
        employee.put("Maria Kr", 10000.);
        employee.put("John Kr", 200000.0);
        employee.put("Eva Kr", 180000.0);
        employee.put("Luke Kr",250000.);
        employee.put("Karolisha", 1000000.);
      String empName="";
     double salary=0;

      for (var e:employee.entrySet() ){
          if (e.getValue()>salary){
              empName=e.getKey();
              salary=e.getValue();

          }

      }System.out.println(empName+" "+salary);

    }
}
