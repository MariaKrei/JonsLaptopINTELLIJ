package HomeWork;

public class HW137 {
  static String name;
  static String city;
  static String nameOfSchool;
 static int batchNumber;
  HW137(String name, String city, String nameOfSchool, int batchNumber){
      this.name=name;
      this.city=city;
      this.nameOfSchool=nameOfSchool;
      this.batchNumber=batchNumber;
  }
  public static void printInfo(){
      System.out.println("My name is "+name+" I live in "+city+"."+"I study at "+nameOfSchool+" in batch "+batchNumber);
  }

    public static void main(String[] args) {
        HW137 n=new HW137("Maria", "St.Louis", "SyntaxTech", 18);
        n.printInfo();
    }
}
